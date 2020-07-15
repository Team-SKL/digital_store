package com.project.digital_store.func.user.buyer.comment;

import com.project.digital_store.base.Constants;
import com.project.digital_store.base.CurrUser;
import com.project.digital_store.base.Result;
import com.project.digital_store.exception.SysException;
import com.project.digital_store.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("user/buyer/comment")
public class UserBuyerCommentController {

    @Autowired
    private UserBuyerCommentService userBuyerCommentService;

    @RequestMapping("/show")
    public Comment showComment(String g_id, HttpSession session){
        CurrUser currUser= (CurrUser) session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        String u_id=currUser.getUserId();
        Comment comment=userBuyerCommentService.showComment(u_id,g_id);
        return comment;
    }

    @RequestMapping("/new")
    public Result newComment(String g_id, String comment, String type, HttpSession session){
        CurrUser currUser= (CurrUser) session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        String u_id=currUser.getUserId();
        try {
            userBuyerCommentService.newComment(u_id,g_id,comment,type);
            return Result.success("评论成功");
        } catch (SysException e) {
            return Result.fail("评论失败");
        }
    }
}
