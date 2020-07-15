package com.project.digital_store.func.buy.detail;


import com.project.digital_store.base.Result;
import com.project.digital_store.dto.GoodInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

@RestController
@RequestMapping("/buy/detail")
public class BuyDetailController {

    @Autowired
    private BuyDetailService buyDetailService;

    @GetMapping("/{g_id}")
    public GoodInfoDto GoodInfo(@PathVariable String g_id){
        return buyDetailService.getGoodInfo(g_id);
    }

   /* @RequestMapping("")
    public Result addCart(@PathVariable String g_id){
        buyDetailService.Cartadd(g_id);
        return Result.success("加入购物车成功！");
    } */

  /* @RequestMapping("/{imgName}")
    public void img(@PathVariable String imgName, HttpServletResponse response)throws Exception{
        InputStream in=null;
        try {
            File dir = new File("../picture");
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

    }*/

}
