package com.project.digital_store.func.user.seller.orderList;


import com.project.digital_store.dto.CartDto;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface OrderListDao {

    List<CartDto> findorderList(@Param("u_id") String u_id);

    @Update("update order_form set o_status = '2' where o_id = #{o_id}")
    void updateOrder(@Param("o_id") String o_id);
}
