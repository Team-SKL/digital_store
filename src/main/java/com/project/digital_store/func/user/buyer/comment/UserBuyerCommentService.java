package com.project.digital_store.func.user.buyer.comment;

import com.project.digital_store.model.Comment;


public interface UserBuyerCommentService {
    Comment showComment(String u_id,String g_id);
    void newComment(String u_id, String g_id, String comment, String type);
}
