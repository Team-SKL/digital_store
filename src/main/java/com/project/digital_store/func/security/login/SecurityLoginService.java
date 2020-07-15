package com.project.digital_store.func.security.login;


import com.project.digital_store.base.CurrUser;

public interface SecurityLoginService {
    CurrUser userCheckLogin(String u_id, String u_pwd);

    CurrUser managerCheckLogin(String m_id, String m_pwd);

    CurrUser sellerCheckLogin(String u_id, String u_pwd);
}
