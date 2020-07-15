package com.project.digital_store.dto;

import com.project.digital_store.model.*;

import java.util.List;

public class GoodInfoDto {

    private String u_id;
    private String g_id;
    private String s_store_name;
    private Camera camera;
    private Laptop laptop;
    private Phone phone;
    private List<Comment> comments;
    private List<Picture> pictures;

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public List<Picture> getPictures() {
        return pictures;
    }

    public void setPictures(List<Picture> pictures) {
        this.pictures = pictures;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getS_store_name() {
        return s_store_name;
    }

    public void setS_store_name(String s_store_name) {
        this.s_store_name = s_store_name;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public String getG_id() {
        return g_id;
    }

    public void setG_id(String g_id) {
        this.g_id = g_id;
    }

}
