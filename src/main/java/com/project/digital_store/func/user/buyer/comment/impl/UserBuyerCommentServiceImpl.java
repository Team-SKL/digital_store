package com.project.digital_store.func.user.buyer.comment.impl;

import com.project.digital_store.exception.SysException;
import com.project.digital_store.func.user.buyer.comment.UserBuyerCommentDao;
import com.project.digital_store.func.user.buyer.comment.UserBuyerCommentService;
import com.project.digital_store.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserBuyerCommentServiceImpl implements UserBuyerCommentService{

    @Autowired
    private UserBuyerCommentDao userBuyerCommentDao;


    @Override
    public Comment showComment(String u_id, String g_id) {
        return userBuyerCommentDao.findComment(u_id,g_id);
    }

    @Override
    public void newComment(String u_id, String g_id, String comment, String type) {
        try {
            userBuyerCommentDao.newComment(u_id,g_id,comment,type);
        } catch (Exception e) {
            throw new SysException("系统错误",e);
        }
    }
}
