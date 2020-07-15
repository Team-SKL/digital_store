package com.project.digital_store.func.user.buyer.cart;

import com.project.digital_store.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Mapper
public interface UserBuyerCartDao {
    List<Order> findOrderByUserId(@Param("u_id")String u_id);
    String findGoodsNameByGoodsId(@Param("g_id")String g_id);
    String findPictureByGoodsId(@Param("g_id")String g_id);
    String findPriceByGoodsId(@Param("g_id")String g_id);
    String findSellerByGoodsId(@Param("g_id")String g_id);
    String findStoreNameBySellerId(@Param("s_id")String s_id);
    String findGoodsQuantityBy(@Param("g_id")String g_id);
    void deleteThisCart (@Param("u_id")String u_id,@Param("g_id")String g_id);

}
