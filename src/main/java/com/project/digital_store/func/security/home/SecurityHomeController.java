package com.project.digital_store.func.security.home;



import com.project.digital_store.base.Constants;
import com.project.digital_store.base.Result;
import com.project.digital_store.dto.GoodsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

@RestController
@RequestMapping("/security/home")
public class SecurityHomeController {

    @Autowired
    private SecurityHomeService securityHomeService;


    @DeleteMapping("/curruser")
    public Result deleteCurrUser(HttpSession session) {

        session.removeAttribute(Constants.SESSION_ATTR_CURRUSER);
        return Result.success("您已成功退出系统！");

    }

    @GetMapping("/curruser")
    public Object getCurrUser(HttpSession session) {


        return session.getAttribute(Constants.SESSION_ATTR_CURRUSER);
    }


    //获得所有的商品信息
    @RequestMapping("/goodsinfo")
    public List<GoodsDto> allGoods(){
        return securityHomeService.getallGoods();
    }



    //根据客户端传来的商品图片名称向客户端发送图片数据
    @RequestMapping("/{imgName}")//路径中的{xxx}表示一个占位参数
    public void img(@PathVariable String imgName , HttpServletResponse response)throws Exception{
        //HttpServletResponse 表示响应，负责向浏览器发送信息
        InputStream in=null;
        try {
            File dir = new File("C:\\Users\\24644\\Desktop\\毕业实习\\20200629_上午\\20200629_上午\\案例\\images");
            File imgFile = new File(dir,imgName);

            //创建一个连接文件的输入流，用于读取文件数据
            in = new FileInputStream(imgFile);

            //获取一个向浏览器输出二进制数据的输出流
            OutputStream out = response.getOutputStream();

            byte[] b = new byte[1024*1024];
            int len = -1;//实际读取的字节数
            while((len = in.read(b)) != -1 ){
                out.write(b,0,len);
            }
            out.flush();//刷空缓存
        } finally {
            in.close();
        }


    }


}
