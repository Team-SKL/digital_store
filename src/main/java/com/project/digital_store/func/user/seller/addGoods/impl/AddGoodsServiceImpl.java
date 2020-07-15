package com.project.digital_store.func.user.seller.addGoods.impl;

import com.project.digital_store.dto.GoodInfoDto;
import com.project.digital_store.func.user.seller.addGoods.AddGoodsDao;
import com.project.digital_store.func.user.seller.addGoods.AddGoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class AddGoodsServiceImpl implements AddGoodsService {

    private int laptopIdNum;
    private int cameraIdNum;
    private int phoneIdNum;

    @PostConstruct//表示该方法在初始化时执行，且仅执行一次（由spring控制）
    public void init(){
        laptopIdNum = addGoodsDao.findMaxNumLaptopId();
        cameraIdNum = addGoodsDao.findMaxNumCameraId();
        phoneIdNum = addGoodsDao.findMaxNumPhoneId();
    }

    private String getNewGoodsId(){
        return String.format("L%05d", ++laptopIdNum);
    }

    @Autowired
    private AddGoodsDao addGoodsDao;

    @Override
    public void Goodsadd(GoodInfoDto goodInfoDto){
        goodInfoDto.setG_id(this.getNewGoodsId());

    }

}
