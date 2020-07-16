package com.project.digital_store.func.user.seller.orderList;


import com.project.digital_store.dto.CartDto;
import com.project.digital_store.model.Order;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrderListDao {

    List<CartDto> findorderList(@Param("u_id") String u_id);

    @Update("update order_form set o_status = '2' where o_id = #{o_id}")
    void updateOrder(@Param("o_id") String o_id);

    @Select("select * from order_form where o_id = #{o_id}")
    Order getOrder(@Param("o_id") String o_id);

    @Update("update sellers_goods set g_quantity =convert(g_quantity,unsigned)-convert('1',unsigned)  where s_id = #{s_id} and g_id = #{g_id}")
    void updateSellersGoods(Order order);

    @Select("select g_quantity from order_form where o_id = #{o_id}")
    String getOrdernum(@Param("o_id") String o_id);

    @Select("select g_quantity from sellers_goods where s_id = #{s_id} and g_id = #{g_id}")
    String getInventorynum(Order order);
}
