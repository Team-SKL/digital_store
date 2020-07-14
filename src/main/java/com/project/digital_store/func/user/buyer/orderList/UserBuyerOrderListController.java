package com.project.digital_store.func.user.buyer.orderList;

import com.project.digital_store.base.Constants;
import com.project.digital_store.base.CurrUser;
import com.project.digital_store.model.Order;
import com.project.digital_store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user/buyer/orderList")
public class UserBuyerOrderListController {
    @Autowired
    private UserBuyerOrderListService userBuyerOrderListService;

    @RequestMapping("")
    public List<Order> show(HttpSession session){
        CurrUser currUser= (CurrUser) session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        List<Order> orderList= userBuyerOrderListService.findOrderByUserId(currUser.getUserId());
        return orderList;
    }
}
