package com.project.digital_store.func.user.seller.info.impl;

import com.project.digital_store.func.user.seller.info.SellerInfoDao;
import com.project.digital_store.func.user.seller.info.SellerInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerInfoServiceImpl implements SellerInfoService {

    @Autowired
    private SellerInfoDao sellerInfoDao;

}
