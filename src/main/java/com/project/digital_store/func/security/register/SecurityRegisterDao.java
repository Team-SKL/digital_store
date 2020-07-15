package com.project.digital_store.func.security.register;

import com.project.digital_store.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SecurityRegisterDao {

    @Select("select * from user where u_id = #{uid}")
    User findUser(@Param("uid") String u_id);
    @Insert("insert into user values(#{uid},#{upwd},#{uname},#{usex},#{ubirthday},#{uidcard},#{ureg},#{ustaus},#{sstaus},#{sreg},#{sname})")
    void insertUser(@Param("uid") String u_id, @Param("upwd") String u_pwd,
                    @Param("uname") String u_name, @Param("usex") String u_sex,
                    @Param("ubirthday") String u_birthday, @Param("uidcard") String u_id_card,
                    @Param("ureg") String u_reg_time, @Param("ustaus") String u_staus,
                    @Param("sstaus") String s_staus, @Param("sreg") String s_reg_time,
                    @Param("sname") String s_store_name);
}
