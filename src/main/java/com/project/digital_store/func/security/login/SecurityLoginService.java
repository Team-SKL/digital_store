package com.project.digital_store.func.security.login;


import com.project.digital_store.base.CurrUser;

public interface SecurityLoginService {
    CurrUser checkLogin(String u_id, String u_pwd);
}
