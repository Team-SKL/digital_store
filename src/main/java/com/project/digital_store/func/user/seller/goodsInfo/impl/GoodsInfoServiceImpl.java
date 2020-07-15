package com.project.digital_store.func.user.seller.goodsInfo.impl;

import com.project.digital_store.dto.GoodInfoDto;
import com.project.digital_store.dto.GoodsDto;
import com.project.digital_store.func.buy.select.BuySelectDao;
import com.project.digital_store.func.user.seller.goodsInfo.GoodsInfoService;
import com.project.digital_store.func.user.seller.goodsInfo.ShelvesGoodsDao;
import com.project.digital_store.model.SellersGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Autowired
    private ShelvesGoodsDao shelvesGoodsDao;

    @Override
    public List<GoodsDto> getshelvesGoods(String s_id){


        return shelvesGoodsDao.findshelvesGoods(s_id);
    }

}
