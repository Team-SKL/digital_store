package com.project.digital_store.func.buy.detail;

import com.project.digital_store.model.*;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BuyDetailDao {

    @Select("select s_store_name from user where u_id = #{u_id}")
    public String findStoreName(@Param("u_id") String u_id);

    @Select("select s_id from sellers_goods where g_id = #{g_id}")
    public String findU_id(@Param("g_id") String g_id);

    @Select("select * from camera where g_id = #{g_id}")
    public Camera findCamera(@Param("g_id") String g_id);

    @Select("select * from laptop where g_id = #{g_id}")
    public Laptop findLaptop(@Param("g_id") String g_id);

    @Select("select * from phone where g_id = #{g_id}")
    public Phone findPhone(@Param("g_id") String g_id);

    @Select("select * from picture where g_id = #{g_id}")
    public List<Picture> findPicture(@Param("g_id") String g_id);

    @Select("select * from comment_form where g_id = #{g_id} and s_id = #{u_id}")
    public List<Comment> findComment(@Param("g_id") String g_id, @Param("u_id") String u_id);

    @Insert("insert into order_form(g_id,u_id,s_id,g_quantity) values(#{g_id},#{u_id},#{s_id},'1')")
    public void insertCart(String g_id,String u_id,String s_id);

}
