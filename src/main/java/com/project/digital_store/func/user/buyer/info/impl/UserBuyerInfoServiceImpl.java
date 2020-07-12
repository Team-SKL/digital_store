package com.project.digital_store.func.user.buyer.info.impl;

import com.project.digital_store.func.user.buyer.info.UserBuyerInfoDao;
import com.project.digital_store.func.user.buyer.info.UserBuyerInfoService;
import com.project.digital_store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBuyerInfoServiceImpl implements UserBuyerInfoService {

    @Autowired
    private UserBuyerInfoDao userBuyerInfoDao;

    @Override
    public User userInfo(String u_id) {

        User user=userBuyerInfoDao.findUserByUserId(u_id);
        return user;
    }
}
