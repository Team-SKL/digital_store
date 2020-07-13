package com.project.digital_store.func.buy.detail.impl;

import com.project.digital_store.dto.GoodInfoDto;
import com.project.digital_store.func.buy.detail.BuyDetailDao;
import com.project.digital_store.func.buy.detail.BuyDetailService;
import com.project.digital_store.model.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuyDetailServiceImpl implements BuyDetailService {
    
    @Autowired
    private BuyDetailDao buyDetailDao;

    @Override
    public GoodInfoDto getGoodInfo(String u_id,String g_id){
        GoodInfoDto goodInfoDto=new GoodInfoDto();
        goodInfoDto.setU_id(u_id);
        goodInfoDto.setS_store_name(buyDetailDao.findStoreName(u_id));
        goodInfoDto.setG_id(g_id);
        Camera camera=new Camera();
        Laptop laptop=new Laptop();
        Phone phone=new Phone();
        if(g_id.charAt(0)=='C') {
            camera = buyDetailDao.findCamera(g_id);
            goodInfoDto.setCamera(camera);
        }
        else if(g_id.charAt(0)=='L'){
            laptop=buyDetailDao.findLaptop(g_id);
            goodInfoDto.setLaptop(laptop);
        }
        else if(g_id.charAt(0)=='P'){
            phone=buyDetailDao.findPhone(g_id);
            goodInfoDto.setPhone(phone);
        }
        List<Picture> pictures=buyDetailDao.findPicture(g_id);
        goodInfoDto.setPictures(pictures);

        List<Comment> comments=buyDetailDao.findComment(g_id,u_id);
        goodInfoDto.setComments(comments);
        return goodInfoDto;
    }
}
