package com.project.digital_store.func.user.seller.goodsInfo;

import com.project.digital_store.base.Result;
import com.project.digital_store.dto.GoodsDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("user/seller/goodsInfo")
public class GoodsInfoController {

    @Autowired
    private GoodsInfoService goodsInfoService;

    @GetMapping("")
    public List<GoodsDto> shelvesGoods(){
        String s_id="0001";
        return goodsInfoService.getshelvesGoods(s_id);
    }
    @DeleteMapping("")
    public Result deleteshelvesGoods(@RequestBody String[] gids){
        goodsInfoService.deleteGoods(gids);
        return Result.success("下架成功！");
    }
}
