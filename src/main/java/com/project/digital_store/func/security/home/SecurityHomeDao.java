package com.project.digital_store.func.security.home;


import com.project.digital_store.dto.GoodsDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface SecurityHomeDao {


    public List<GoodsDto> getallGoods();


}
