package com.project.digital_store.func.user.buyer.info;

import com.project.digital_store.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserBuyerInfoDao {

    @Select("select * from user where u_id=#{u_id} ")
    User findUserByUserId(@Param("u_id") String u_id);
}
