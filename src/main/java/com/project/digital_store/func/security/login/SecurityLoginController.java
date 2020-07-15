package com.project.digital_store.func.security.login;


import com.project.digital_store.base.Constants;
import com.project.digital_store.base.CurrUser;
import com.project.digital_store.base.Result;
import com.project.digital_store.exception.BusinessException;
import com.project.digital_store.exception.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/security/login")
public class SecurityLoginController {

    @Autowired
    private SecurityLoginService securityLoginService;

    @RequestMapping("/user") //用户登录
    public Result userLogin(String u_id, String u_pwd, HttpSession session) {

        try {
            CurrUser currUser = securityLoginService.userCheckLogin(u_id, u_pwd);

            //登陆成功，将当前用户放入session中
            session.setAttribute(Constants.SESSION_ATTR_CURRUSER,currUser);
            return Result.success("登录成功！");
        } catch (BusinessException e) {
            return Result.fail(e.getMessage());
        } catch (SysException e) {
            e.printStackTrace();
            return Result.fail("系统升级中...");
        }



    }


    @RequestMapping("/seller") //商家登录
    public Result sellerLogin(String u_id, String u_pwd, HttpSession session) {

        try {
            CurrUser currUser = securityLoginService.sellerCheckLogin(u_id, u_pwd);

            //登陆成功，将当前用户放入session中
            session.setAttribute(Constants.SESSION_ATTR_CURRUSER,currUser);
            return Result.success("登录成功！");
        } catch (BusinessException e) {
            return Result.fail(e.getMessage());
        } catch (SysException e) {
            e.printStackTrace();
            return Result.fail("系统升级中...");
        }



    }




    @RequestMapping("/manager") //管理员登录
    public Result managerLogin(String m_id, String m_pwd, HttpSession session) {

        try {
            CurrUser currUser = securityLoginService.managerCheckLogin(m_id, m_pwd);

            //登陆成功，将当前用户放入session中
            session.setAttribute(Constants.SESSION_ATTR_CURRUSER,currUser);
            return Result.success("登录成功！");
        } catch (BusinessException e) {
            return Result.fail(e.getMessage());
        } catch (SysException e) {
            e.printStackTrace();
            return Result.fail("系统升级中...");
        }



    }


}
