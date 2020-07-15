package com.project.digital_store.func.user.buyer.orderList;

import com.project.digital_store.model.Order;

import java.util.List;

public interface UserBuyerOrderListService {
    List<Order> findOrderByUserId(String u_id);
}
