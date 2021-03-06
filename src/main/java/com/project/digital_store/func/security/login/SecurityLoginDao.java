package com.project.digital_store.func.security.login;


import com.project.digital_store.model.Manager;
import com.project.digital_store.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SecurityLoginDao {

    @Select("select * from user where u_id = #{uid} and u_pwd = #{upwd}")
    User findUserByUserIdAndUserPwd(@Param("uid") String u_id, @Param("upwd") String u_pwd);

    @Select("select * from manager where m_id = #{mid} and m_pwd = #{mpwd}")
    Manager findMgrByMgrIdAndMgrPwd(@Param("mid") String m_id, @Param("mpwd") String m_pwd);
}
