package com.project.digital_store.func.security.home;



import com.project.digital_store.base.Constants;
import com.project.digital_store.base.Result;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/security/home")
public class SecurityHomeController {


    @DeleteMapping("/curruser")
    public Result deleteCurrUser(HttpSession session) {

        session.removeAttribute(Constants.SESSION_ATTR_CURRUSER);
        return Result.success("您已成功退出系统！");

    }

    @GetMapping("/curruser")
    public Object getCurrUser(HttpSession session) {


        return session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
    }


}
