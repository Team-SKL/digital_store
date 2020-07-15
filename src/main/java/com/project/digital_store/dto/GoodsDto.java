package com.project.digital_store.dto;

public class GoodsDto {

    private String pic_path;
    private String s_id;
    private String g_id;
    private String g_price;
    private String g_quantity;
    private String s_store_name;
    private String g_model;


    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
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

}
