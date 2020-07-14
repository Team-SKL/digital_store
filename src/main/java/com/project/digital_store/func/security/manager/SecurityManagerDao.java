package com.project.digital_store.func.security.manager;



import com.project.digital_store.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface SecurityManagerDao {

    @Select("select u_id,u_staus from user")
    public List<User> findUserList();

    @Update("update user set u_staus = #{to} where u_id = #{u_id} and u_staus = #{from}")
    void changeUserStaus(@Param("u_id") String u_id, @Param("from") Integer from, @Param("to") Integer to);

    @Update("update user set s_staus = #{to} where u_id = #{u_id} and s_staus = #{from}")
    void changeSellerStaus(@Param("u_id") String u_id, @Param("from") Integer from, @Param("to") Integer to);
}
