package com.project.digital_store.dto;

public class CartDto {
    private String g_id;
    private String g_model;
    private String g_quantity;
    private String g_price;
    private String o_sub_time;
    private String o_sign_time;
    private String o_status;
    private String s_store_name;
    private String pic_path;


    public CartDto() {
    }

    public String getO_sub_time() {
        return o_sub_time;
    }

    public void setO_sub_time(String o_sub_time) {
        this.o_sub_time = o_sub_time;
    }

    public String getO_sign_time() {
        return o_sign_time;
    }

    public void setO_sign_time(String o_sign_time) {
        this.o_sign_time = o_sign_time;
    }

    public String getO_status() {
        return o_status;
    }

    public void setO_status(String o_status) {
        this.o_status = o_status;
    }

    public String getG_id() {
        return g_id;
    }

    public void setG_id(String g_id) {
        this.g_id = g_id;
    }

    public String getG_model() {
        return g_model;
    }

    public void setG_model(String g_model) {
        this.g_model = g_model;
    }

    public String getG_quantity() {
        return g_quantity;
    }

    public void setG_quantity(String g_quantity) {
        this.g_quantity = g_quantity;
    }

    public String getG_price() {
        return g_price;
    }

    public void setG_price(String g_price) {
        this.g_price = g_price;
    }

    public String getS_store_name() {
        return s_store_name;
    }

    public void setS_store_name(String s_store_name) {
        this.s_store_name = s_store_name;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

}
