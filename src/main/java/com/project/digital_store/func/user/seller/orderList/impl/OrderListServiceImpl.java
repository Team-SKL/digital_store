package com.project.digital_store.func.user.seller.orderList.impl;

import com.project.digital_store.dto.CartDto;
import com.project.digital_store.func.user.seller.orderList.OrderListDao;
import com.project.digital_store.func.user.seller.orderList.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderListServiceImpl implements OrderListService {

    @Autowired
    private OrderListDao orderListDao;

    @Override
    public List<CartDto> getorderList(String u_id){
        return orderListDao.findorderList(u_id);
    }

    @Override
    public void OrderComplete(String o_id){
        orderListDao.updateOrder(o_id);
    }

}
