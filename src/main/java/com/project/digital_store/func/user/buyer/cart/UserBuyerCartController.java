package com.project.digital_store.func.user.buyer.cart;

import com.project.digital_store.base.Constants;
import com.project.digital_store.base.CurrUser;
import com.project.digital_store.base.Result;
import com.project.digital_store.dto.CartDto;
import com.project.digital_store.exception.SysException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

@RestController
@RequestMapping("user/buyer/cart")
public class UserBuyerCartController {
    @Autowired
    private UserBuyerCartService userBuyerCartService;

    @RequestMapping("/show")
    public List<CartDto> showCart(HttpSession session){
        CurrUser currUser= (CurrUser) session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        List<CartDto> cartList=userBuyerCartService.showCart(currUser.getUserId());
        return  cartList;
    }

    @RequestMapping("/delete")
    public Result deleteCart(List<CartDto> cartList,HttpSession session){
        CurrUser currUser= (CurrUser) session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
        try {
            userBuyerCartService.deleteCart(currUser.getUserId(),cartList);
            return Result.success("删除成功");
        } catch (SysException e) {
            return Result.fail("系统升级中......");
        }
    }
    @RequestMapping("/img")
    public void img(@PathVariable String imgName, HttpServletResponse response)throws Exception{
        InputStream in=null;
        try {
            File dir = new File("../../../../../../../picture");
            File imgFile =new File(dir,imgName);

            in = new FileInputStream(imgFile);
            OutputStream out = response.getOutputStream();

            byte[] b= new byte[1024*1024];
            int len=-1;
            while((len=in.read(b))!=-1){
                out.write(b,0,len);
            }
            out.flush();//刷空缓存
        } finally {
            in.close();
        }
    }
}
