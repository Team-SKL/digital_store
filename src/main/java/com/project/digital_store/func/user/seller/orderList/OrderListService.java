package com.project.digital_store.func.user.seller.orderList;

import com.project.digital_store.dto.CartDto;
import com.project.digital_store.model.Order;

import java.util.List;

public interface OrderListService {


    List<CartDto> getorderList(String u_id);

    void OrderComplete(Order order);

    boolean CheckInventory(Order order);

    Order getOrder(String o_id);
}
