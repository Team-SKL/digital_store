package com.project.digital_store.func.user.buyer.cart;

import com.project.digital_store.base.Result;
import com.project.digital_store.dto.CartDto;

import java.util.List;

public interface UserBuyerCartService {
    List<CartDto> showCart(String u_id);
    void deleteCart(String u_id,List<CartDto> cartList);
}
