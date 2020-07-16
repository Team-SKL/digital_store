package com.project.digital_store.func.user.seller.orderList;


import com.project.digital_store.base.Result;
import com.project.digital_store.dto.CartDto;
import com.project.digital_store.model.Order;
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
        Order order=orderListService.getOrder(o_id);
        if(orderListService.CheckInventory(order)) {
            orderListService.OrderComplete(order);
            return Result.success("已确认发货！");
        }
        else{
            return Result.fail("库存不足,请补充库存后发货！");
        }
    }

}
