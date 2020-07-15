package com.project.digital_store.func.security.editpwd.impl;


import com.project.digital_store.exception.BusinessException;
import com.project.digital_store.exception.SysException;
import com.project.digital_store.func.security.editpwd.SecurityEditpwdDao;
import com.project.digital_store.func.security.editpwd.SecurityEditpwdService;
import com.project.digital_store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityEditpwdServiceImpl implements SecurityEditpwdService {

    @Autowired
    private SecurityEditpwdDao securityEditpwdDao;

    @Override
    public void editpwd(String u_id, String u_pwd, String u_newpwd) {

        User user = null;

        try {
            user = securityEditpwdDao.findUser(u_id, u_pwd);
        } catch (Exception e) {
            throw new SysException("系统错误！",e);
        }
        if(user == null) {
            throw new BusinessException("用户名或密码错误！");
        }

        securityEditpwdDao.editpwd(u_id,u_pwd,u_newpwd);


    }
}
