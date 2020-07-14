package com.project.digital_store.func.user.buyer.orderList.impl;

import com.project.digital_store.exception.SysException;
import com.project.digital_store.func.user.buyer.orderList.UserBuyerOrderListDao;
import com.project.digital_store.func.user.buyer.orderList.UserBuyerOrderListService;
import com.project.digital_store.model.Order;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
}
