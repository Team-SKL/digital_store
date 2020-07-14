package com.project.digital_store.func.buy.select.impl;

import com.project.digital_store.func.buy.detail.BuyDetailDao;
import com.project.digital_store.func.buy.detail.BuyDetailService;
import com.project.digital_store.func.buy.select.BuySelectDao;
import com.project.digital_store.func.buy.select.BuySelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuySelectServiceImpl implements BuySelectService {

    @Autowired
    private BuySelectDao buySelectDao;

}
