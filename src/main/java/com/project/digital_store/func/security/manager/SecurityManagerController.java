package com.project.digital_store.func.security.manager;


import com.project.digital_store.base.Result;
import com.project.digital_store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/security/manager")
public class SecurityManagerController {

    @Autowired
    private  SecurityManagerService securityManagerService;

    @RequestMapping("/user")
    public List<User> userList() {
        return securityManagerService.getUserList();
    }

    @RequestMapping("/unuse/{u_id}")
    public Result unuseUser(@PathVariable String u_id) {
        securityManagerService.unuseUser(u_id);
        return Result.success("用户已被成功禁用！");

    }

    @RequestMapping("/use/{u_id}")
    public Result useUser(@PathVariable String u_id) {
        securityManagerService.useUser(u_id);
        return Result.success("用户已被成功启用！");

    }

    @RequestMapping("/unuses/{u_id}")
    public Result unuseSeller(@PathVariable String u_id) {
        securityManagerService.unuseSeller(u_id);
        return Result.success("商家已被成功禁用！");

    }

    @RequestMapping("/uses/{u_id}")
    public Result useSeller(@PathVariable String u_id) {
        securityManagerService.useSeller(u_id);
        return Result.success("商家已被成功启用！");

    }




}
