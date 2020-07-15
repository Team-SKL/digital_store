package com.project.digital_store.func.security.register;

public interface SecurityRegisterService {

    void userRegister(String u_id, String u_pwd, String u_name, String u_sex, String u_birthday, String u_id_card);

    void sellerRegister(String u_id, String u_pwd, String u_name, String u_sex, String u_birthday, String u_id_card, String s_store_name);
}
