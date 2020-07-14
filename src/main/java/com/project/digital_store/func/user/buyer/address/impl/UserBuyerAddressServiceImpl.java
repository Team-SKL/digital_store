package com.project.digital_store.func.user.buyer.address.impl;

import com.project.digital_store.exception.SysException;
import com.project.digital_store.func.user.buyer.address.UserBuyerAddressDao;
import com.project.digital_store.func.user.buyer.address.UserBuyerAddressService;
import com.project.digital_store.model.Address;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBuyerAddressServiceImpl implements UserBuyerAddressService {

    @Autowired
    private UserBuyerAddressDao userBuyerAddressDao;

    @Override
    public List<Address> select(String u_id){
        List<Address> addrList= null;
        try {
            addrList = userBuyerAddressDao.findAllAddress(u_id);
        } catch (Exception e) {
            throw new SysException("系统错误",e);
        }
        return addrList;
    }
    @Override
    public void update(String phone,String province,String city,String detail){

        try {
            userBuyerAddressDao.updateAddress(phone,province,city,detail);
        } catch (Exception e) {
            throw new SysException("系统错误",e);
        }
    }
    @Override
    public void insert(String a_id,String u_id,String phone,String province,String city,String detail){
        try {
            userBuyerAddressDao.insertAddress(a_id,u_id,phone,province,city,detail);
        } catch (Exception e) {
            throw new SysException("系统错误",e);
        }
    }
    @Override
    public void delete(String a_id){
        try {
            userBuyerAddressDao.deleteAddress(a_id);
        } catch (Exception e) {
            throw new SysException("系统错误",e);
        }

    }

}
