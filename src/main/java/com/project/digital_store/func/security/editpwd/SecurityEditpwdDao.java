package com.project.digital_store.func.security.editpwd;



import com.project.digital_store.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

@Mapper
public interface  SecurityEditpwdDao {

    @Select("select * from user where u_id = #{uid} and u_pwd = #{upwd}")
    User findUser(@Param("uid") String u_id, @Param("upwd") String u_pwd);

    @Update("update user set u_pwd = #{newpwd} where u_id = #{u_id} and u_pwd = #{pwd}")
    void editpwd(@Param("u_id") String u_id, @Param("pwd") String u_pwd, @Param("newpwd") String u_newpwd);


}
