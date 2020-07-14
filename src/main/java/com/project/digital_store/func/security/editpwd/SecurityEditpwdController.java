package com.project.digital_store.func.security.editpwd;



import com.project.digital_store.base.Result;
import com.project.digital_store.exception.BusinessException;
import com.project.digital_store.exception.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/security/editpwd")
public class SecurityEditpwdController {

    @Autowired
    private SecurityEditpwdService securityEditpwdService;

    @RequestMapping("")
    public Result editpwd(String u_id, String u_pwd, String u_newpwd) {


        try {
            securityEditpwdService.editpwd(u_id,u_pwd,u_newpwd);

            return Result.success("密码修改成功！");
        } catch (BusinessException e) {
            return Result.fail(e.getMessage());
        } catch (SysException e) {
            e.printStackTrace();
            return Result.fail("系统升级中...");
        }

    }

}
