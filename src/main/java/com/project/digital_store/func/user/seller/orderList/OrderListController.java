package com.project.digital_store.func.user.seller.orderList;


import com.project.digital_store.base.Result;
import com.project.digital_store.dto.CartDto;
import com.project.digital_store.func.user.buyer.orderList.UserBuyerOrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user/sellers/orderList")
public class OrderListController  {

    @Autowired
    private OrderListService orderListService;

    @RequestMapping("")
    public List<CartDto> orderList(){
        String u_id="0001";
        return orderListService.getorderList(u_id);
    }

    @PutMapping("")
    public Result completeOrder(@PathVariable String o_id){
        orderListService.OrderComplete(o_id);
        return Result.success("已确认发货！");
    }
}
