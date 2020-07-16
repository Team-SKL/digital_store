package com.project.digital_store.func.buy.select.impl;

import com.project.digital_store.dto.GoodsDto;
import com.project.digital_store.func.buy.select.BuySelectDao;
import com.project.digital_store.func.buy.select.BuySelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BuySelectServiceImpl implements BuySelectService {

    @Autowired
    private BuySelectDao buySelectDao;

    @Override
    public List<GoodsDto> getselectGoods(String info){
        return buySelectDao.findGoods(info);
    }
}
