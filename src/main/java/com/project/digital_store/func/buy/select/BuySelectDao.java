package com.project.digital_store.func.buy.select;

import com.project.digital_store.dto.GoodsDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BuySelectDao {


    public List<GoodsDto> findGoods(@Param("info") String info);
}
