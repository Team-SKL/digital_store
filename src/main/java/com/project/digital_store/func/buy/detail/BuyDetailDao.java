package com.project.digital_store.func.buy.detail;

import com.project.digital_store.model.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BuyDetailDao {

    @Select("select s_store_name from user where u_id = 0001")
    public String findStoreName(@Param("u_id") String u_id);

    @Select("select * from camera where g_id = #{g_id}")
    public Camera findCamera(@Param("g_id") String g_id);

    @Select("select * from laptop where g_id = #{g_id}")
    public Laptop findLaptop(@Param("g_id") String g_id);

    @Select("select * from phone where g_id = #{g_id}")
    public Phone findPhone(@Param("g_id") String g_id);

    @Select("select * from picture where g_id = #{g_id}")
    public List<Picture> findPicture(@Param("g_id") String g_id);

    @Select("select * from comment_form where g_id = #{g_id} and s_id = #{u_id}")
    public List<Comment> findComment(@Param("g_id") String g_id,@Param("u_id") String u_id);
}
