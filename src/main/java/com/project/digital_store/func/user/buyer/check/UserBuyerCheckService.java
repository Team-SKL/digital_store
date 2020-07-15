package com.project.digital_store.func.user.buyer.check;

import com.project.digital_store.dto.CartDto;
import com.project.digital_store.model.Order;

import java.util.List;

public interface UserBuyerCheckService {
    void subOrder(List<CartDto> orderList,String u_id);
}
