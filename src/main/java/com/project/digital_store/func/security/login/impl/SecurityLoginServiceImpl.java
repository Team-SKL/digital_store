package com.project.digital_store.func.security.login.impl;


import com.project.digital_store.base.CurrUser;
import com.project.digital_store.exception.BusinessException;
import com.project.digital_store.exception.SysException;
import com.project.digital_store.func.security.login.SecurityLoginDao;
import com.project.digital_store.func.security.login.SecurityLoginService;
import com.project.digital_store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SecurityLoginServiceImpl implements SecurityLoginService {

    @Autowired
    private SecurityLoginDao securityLoginDao;

    @Override
    public CurrUser checkLogin(String u_id, String u_pwd) {

        User user = null;
        try {
            user = securityLoginDao.findUserByUserIdAndUserPwd(u_id, u_pwd);
        } catch (Exception e) {
            throw new SysException("系统错误！",e);
        }
        if(user == null) {
            throw new BusinessException("用户名或密码错误！");
        }

        if(!user.getU_staus().equals(1)&&!user.getS_staus().equals(1)) {
            throw new BusinessException("该用户已禁用！");
        }

        CurrUser currUser = new CurrUser(user.getU_id(),user.getU_name());

        return currUser;
    }
}
