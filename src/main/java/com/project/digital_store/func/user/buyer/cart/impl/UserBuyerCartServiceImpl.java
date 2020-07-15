package com.project.digital_store.func.user.buyer.cart.impl;

import com.project.digital_store.base.Result;
import com.project.digital_store.dto.CartDto;
import com.project.digital_store.exception.SysException;
import com.project.digital_store.func.user.buyer.cart.UserBuyerCartDao;
import com.project.digital_store.func.user.buyer.cart.UserBuyerCartService;
import com.project.digital_store.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserBuyerCartServiceImpl implements UserBuyerCartService {
    @Autowired
    private UserBuyerCartDao userBuyerCartDao;


    @Override
    public List<CartDto> showCart(String u_id) {
        List<CartDto> cartList =new ArrayList<>();
        List<Order> orderList = userBuyerCartDao.findOrderByUserId(u_id);
        CartDto currCart=null;
        for(Order order:orderList){
            currCart.setG_id(order.getG_id());
            currCart.setG_model(userBuyerCartDao.findGoodsNameByGoodsId(order.getG_id()));
            currCart.setG_quantity(userBuyerCartDao.findGoodsQuantityBy(order.getG_id()));
            currCart.setG_price(userBuyerCartDao.findPriceByGoodsId(order.getG_id()));
            currCart.setS_store_name(userBuyerCartDao.findStoreNameBySellerId(userBuyerCartDao.findSellerByGoodsId(order.getG_id())));
            currCart.setPic_path(userBuyerCartDao.findPictureByGoodsId(order.getG_id()));
            cartList.add(currCart);
        }
        return cartList;
    }

    @Override
    public void deleteCart(String u_id,List<CartDto> cartList) {
        try {
            for(CartDto thisCart:cartList) {
                userBuyerCartDao.deleteThisCart(u_id, thisCart.getG_id());
            }
        } catch (Exception e) {
            throw new SysException("系统错误",e);
        }
    }
}
