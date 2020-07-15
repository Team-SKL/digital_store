package com.project.digital_store.func.user.seller.orderList;

import com.project.digital_store.dto.CartDto;

import java.util.List;

public interface OrderListService {


    List<CartDto> getorderList(String u_id);

    void OrderComplete(String o_id);
}
