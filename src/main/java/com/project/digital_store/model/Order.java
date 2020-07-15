package com.project.digital_store.model;

public class Order {
    private String o_id;
    private String u_id;
    private String s_id;
    private String g_id;
    private String g_quantity;
    private String o_sub_time;
    private String o_status;
    private String o_sign_time;

    public String getO_id() {
        return o_id;
    }

    public void setO_id(String o_id) {
        this.o_id = o_id;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getS_id() {
        return s_id;
    }

    public void setS_id(String s_id) {
        this.s_id = s_id;
    }

    public String getG_id() {
        return g_id;
    }

    public void setG_id(String g_id) {
        this.g_id = g_id;
    }

    public String getG_quantity() {
        return g_quantity;
    }

    public void setG_quantity(String g_quantity) {
        this.g_quantity = g_quantity;
    }

    public String getO_sub_time() {
        return o_sub_time;
    }

    public void setO_sub_time(String o_sub_time) {
        this.o_sub_time = o_sub_time;
    }

    public String getO_status() {
        return o_status;
    }

    public void setO_status(String o_status) {
        this.o_status = o_status;
    }

    public String getO_sign_time() {
        return o_sign_time;
    }

    public void setO_sign_time(String o_sign_time) {
        this.o_sign_time = o_sign_time;
    }
}
