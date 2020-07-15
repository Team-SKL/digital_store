package com.project.digital_store.func.user.buyer.orderList.impl;

import com.project.digital_store.exception.SysException;
import com.project.digital_store.func.user.buyer.orderList.UserBuyerOrderListDao;
import com.project.digital_store.func.user.buyer.orderList.UserBuyerOrderListService;
import com.project.digital_store.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class UserBuyerOrderListServiceImpl implements UserBuyerOrderListService {

    @Autowired
    private UserBuyerOrderListDao userBuyerOrderListDao;

    @Override
    public List<Order> findOrderByUserId(String u_id){

        List<Order> orderList=userBuyerOrderListDao.findOrderByUserId(u_id);
        return orderList;
    }

    @Override
    public void signOrder(String o_id) {
        long time = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String o_sub_time= dateFormat.format(time);
        try {
            userBuyerOrderListDao.signOrder(o_id,o_sub_time);
        } catch (Exception e) {
            throw new SysException("系统错误",e);
        }
    }
}
