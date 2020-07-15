package com.project.digital_store.func.user.buyer.check;

import com.project.digital_store.base.Constants;
import com.project.digital_store.base.CurrUser;
import com.project.digital_store.base.Result;
import com.project.digital_store.dto.CartDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("/user/buyer/check")
public class UserBuyerCheckController {

    @Autowired
    private UserBuyerCheckService userBuyerCheckService;

    @RequestMapping("")
    public Result subOrder(List<CartDto> orderList, HttpSession session){
        CurrUser currUser= (CurrUser) session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        try {
            userBuyerCheckService.subOrder(orderList,currUser.getUserId());
            return Result.success("订单提交成功");
        } catch (Exception e) {
            return Result.fail("系统升级中......");
        }
    }
}
