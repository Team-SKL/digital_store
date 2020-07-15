package com.project.digital_store.func.user.buyer.check.impl;

import com.project.digital_store.dto.CartDto;
import com.project.digital_store.exception.SysException;
import com.project.digital_store.func.user.buyer.check.UserBuyerCheckDao;
import com.project.digital_store.func.user.buyer.check.UserBuyerCheckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.text.SimpleDateFormat;
import java.util.List;
@Service
public class UserBuyerCheckServiceImpl implements UserBuyerCheckService {

    private int addressIdNum;

    @PostConstruct//表示该方法在初始化时执行，且仅执行一次（由spring控制）
    public void init(){

        addressIdNum = userBuyerCheckDao.findMaxNumOfAddressId();
    }

    private String getNewAddressId(){
        return String.format("%05d", ++addressIdNum);
    }
    @Autowired
    private UserBuyerCheckDao userBuyerCheckDao;

    @Override
    public void subOrder(List<CartDto> orderList, String u_id) {
        long time = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String o_sub_time= dateFormat.format(time);
        try {
            for(CartDto currOrder : orderList){
                String o_id=this.getNewAddressId();
                userBuyerCheckDao.subOrder(u_id,currOrder.getG_id(),o_id,o_sub_time);
            }
        } catch (Exception e) {
            throw new SysException("系统错误",e);
        }
    }
}
