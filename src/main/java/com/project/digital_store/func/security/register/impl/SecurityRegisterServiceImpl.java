package com.project.digital_store.func.security.register.impl;

import com.project.digital_store.exception.BusinessException;
import com.project.digital_store.exception.SysException;
import com.project.digital_store.func.security.register.SecurityRegisterDao;
import com.project.digital_store.func.security.register.SecurityRegisterService;
import com.project.digital_store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;

@Service
public class SecurityRegisterServiceImpl implements SecurityRegisterService {

    @Autowired
    private SecurityRegisterDao securityRegisterDao;



    @Override
    public void userRegister(String u_id, String u_pwd, String u_name, String u_sex, String u_birthday, String u_id_card) {

        User user = null;

        try {
            user = securityRegisterDao.findUser(u_id);

        } catch (Exception e) {
            throw new SysException("系统错误！",e);
        }
        if(user != null) {
            throw new BusinessException("该手机号已被注册！");
        }

        long time = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String u_reg_time = dateFormat.format(time);
        String u_staus = "1";
        String s_staus = "0";
        String s_reg_time = null;
        String s_store_name = null;


        securityRegisterDao.insertUser(u_id,u_pwd,u_name,u_sex,u_birthday,u_id_card,u_reg_time,u_staus,s_staus,s_reg_time,s_store_name);




    }

    @Override
    public void sellerRegister(String u_id, String u_pwd, String u_name, String u_sex, String u_birthday, String u_id_card, String s_store_name) {
        User user = null;

        try {
            user = securityRegisterDao.findUser(u_id);

        } catch (Exception e) {
            throw new SysException("系统错误！",e);
        }
        if(user != null) {
            throw new BusinessException("该手机号已被注册！");
        }

        long time = System.currentTimeMillis();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String u_reg_time = dateFormat.format(time);
        String u_staus = "1";
        String s_staus = "1";
        String s_reg_time = dateFormat.format(time);



        securityRegisterDao.insertUser(u_id,u_pwd,u_name,u_sex,u_birthday,u_id_card,u_reg_time,u_staus,s_staus,s_reg_time,s_store_name);
    }
}
