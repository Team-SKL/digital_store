package com.project.digital_store.func.user.seller.goodsInfo;

import com.project.digital_store.dto.GoodsDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface ShelvesGoodsDao {


    public List<GoodsDto> findshelvesGoods(@Param("s_id") String s_id);

    @Delete("delete from sellers_Goods where g_id = #{g_id}")
    public void deleteSellersGoods(@Param("g_id") String g_id);


    @Update("update sellers_Goods set g_price = #{g_price},g_quantity = #{g_quantity} where g_id = #{g_id}")
    public void updateSellersGoods(GoodsDto goodsDto);
}
