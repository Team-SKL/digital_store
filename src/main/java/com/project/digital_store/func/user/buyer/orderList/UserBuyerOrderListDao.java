package com.project.digital_store.func.user.buyer.orderList;

import com.project.digital_store.model.Order;
import com.project.digital_store.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserBuyerOrderListDao {

    @Select("select * from order_form where u_id=#{u_id} and o_status!='0'")
    List<Order> findOrderByUserId(@Param("u_id") String u_id);
}
