package com.project.digital_store.func.user.buyer.check;

import com.project.digital_store.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface UserBuyerCheckDao {

    @Select("select ifnull(convert(substring(max(a_id),1),unsigned),0) from address")
    int findMaxNumOfAddressId();

    @Update("update order_form set o_id=#{o_id},o_sub_time=#{nowTime},o_status='1' where u_id=#{u_id} and g_id=#{g_id}")
    Order subOrder(@Param("u_id")String u_id,@Param("g_id") String g_id,@Param("o_id")String o_id,@Param("nowTime")String nowTime);
}
