package com.project.digital_store.func.user.buyer.info;

import com.project.digital_store.base.Constants;
import com.project.digital_store.base.CurrUser;
import com.project.digital_store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user/buyer/info")
public class UserBuyerInfoController {

    @Autowired
    private UserBuyerInfoService userBuyerInfoService;

    @RequestMapping("")
    public User Info(HttpSession session){
        CurrUser currUser= (CurrUser) session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        return userBuyerInfoService.userInfo(currUser.getUserId());

    }

}
