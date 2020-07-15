package com.project.digital_store.func.security.register;

import com.project.digital_store.base.Result;
import com.project.digital_store.exception.BusinessException;
import com.project.digital_store.exception.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/register")
public class SecurityRegisterController {

    @Autowired
    private SecurityRegisterService securityRegisterService;

    @RequestMapping("/user") //用户注册
    public Result userRegister (String u_id, String u_pwd, String u_name,
                                String u_sex, String u_birthday, String u_id_card) {


        try {
            securityRegisterService.userRegister(u_id, u_pwd, u_name, u_sex, u_birthday, u_id_card);

            return Result.success("注册用户成功！");
        } catch (BusinessException e) {
            return Result.fail(e.getMessage());
        } catch (SysException e) {
            e.printStackTrace();
            return Result.fail("系统升级中...");
        }

    }



    @RequestMapping("/seller") //商家注册
    public Result sellerRegister (String u_id, String u_pwd, String u_name,
                                  String u_sex, String u_birthday, String u_id_card,
                                  String s_store_name) {


        try {
            securityRegisterService.sellerRegister(u_id, u_pwd, u_name, u_sex, u_birthday, u_id_card, s_store_name);

            return Result.success("注册商家成功！");
        } catch (BusinessException e) {
            return Result.fail(e.getMessage());
        } catch (SysException e) {
            e.printStackTrace();
            return Result.fail("系统升级中...");
        }

    }



}
