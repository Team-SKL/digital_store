package com.project.digital_store.func.user.seller.goodsInfo;

import com.project.digital_store.dto.GoodInfoDto;
import com.project.digital_store.dto.GoodsDto;
import com.project.digital_store.model.SellersGoods;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface ShelvesGoodsDao {


    public List<GoodsDto> findshelvesGoods(@Param("s_id") String s_id);

    @Delete("delete from sellers_Goods where g_id = #{g_id}")
    public void deleteSellersGoods(@Param("g_id") String g_id);

    @Delete("delete from camera where g_id = #{g_id}")
    public void deletecamera(@Param("g_id") String g_id);

    @Delete("delete from laptop where g_id = #{g_id}")
    public void deletelaptop(@Param("g_id") String g_id);

    @Delete("delete from phone where g_id = #{g_id}")
    public void deletephone(@Param("g_id") String g_id);

    @Update("update sellers_Goods set g_price = #{g_price},g_quantity = #{g_quantity} where g_id = #{g_id}")
    public void updateSellersGoods(GoodsDto goodsDto);
}
