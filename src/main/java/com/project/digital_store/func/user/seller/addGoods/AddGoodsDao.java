package com.project.digital_store.func.user.seller.addGoods;


import com.project.digital_store.dto.GoodInfoDto;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface AddGoodsDao {

    @Select("select ifnull(convert(substring(max(g_id),2),unsigned),0) from laptop ")
    int findMaxNumLaptopId();

    @Select("select ifnull(convert(substring(max(g_id),2),unsigned),0) from camera ")
    int findMaxNumCameraId();

    @Select("select ifnull(convert(substring(max(g_id),2),unsigned),0) from phone ")
    int findMaxNumPhoneId();

    @Insert("insert into sellers_goods(s_id,g_id,g_price,g_quantity) values(#{u_id},#{g_id},#{g_price},#{g_quantity})")
    void insertNewEmp(GoodInfoDto goodInfoDto);
}
