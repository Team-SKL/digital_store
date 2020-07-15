package com.project.digital_store.func.user.buyer.orderList;

import com.project.digital_store.model.Order;
import com.project.digital_store.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface UserBuyerOrderListDao {

    @Select("select * from order_form where u_id=#{u_id} and o_status!='0'")
    List<Order> findOrderByUserId(@Param("u_id") String u_id);

    @Update("update order_form set o_status='3',o_sign_time=#{nowTime} where o_id=#{o_id}")
    void signOrder(@Param("o_id")String o_id,@Param("nowTime")String o_sign_time);
}
