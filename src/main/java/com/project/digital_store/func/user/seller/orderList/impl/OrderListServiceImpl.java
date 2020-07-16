package com.project.digital_store.func.user.seller.orderList.impl;

import com.project.digital_store.dto.CartDto;
import com.project.digital_store.func.user.seller.orderList.OrderListDao;
import com.project.digital_store.func.user.seller.orderList.OrderListService;
import com.project.digital_store.model.Order;
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
    public Order getOrder(String o_id){
        return orderListDao.getOrder(o_id);
    }

    @Override
    public void OrderComplete(Order order){

        orderListDao.updateOrder(order.getO_id());
        orderListDao.updateSellersGoods(order);
    }

    @Override
    public boolean CheckInventory(Order order){
        String Ordernum=orderListDao.getOrdernum(order.getO_id());
        String Inventorynum=orderListDao.getInventorynum(order);
        return Integer.parseInt(Ordernum)<=Integer.parseInt(Inventorynum);
    }

}
