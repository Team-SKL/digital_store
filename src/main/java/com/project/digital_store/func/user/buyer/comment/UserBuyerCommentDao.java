package com.project.digital_store.func.user.buyer.comment;

import com.project.digital_store.model.Comment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface UserBuyerCommentDao {
    Comment findComment (@Param("u_id")String u_id,@Param("g_id")String g_id);
    void newComment (@Param("u_id")String u_id,@Param("g_id")String g_id,
                     @Param("comment")String comment,@Param("type")String type);
}
