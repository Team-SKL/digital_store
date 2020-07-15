package com.project.digital_store.func.user.seller.addGoods;


import com.project.digital_store.base.Result;
import com.project.digital_store.dto.GoodInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/seller/addGoods")
public class AddGoodsController {

    @Autowired
    private AddGoodsService addGoodsService;

    @PostMapping("")
    public Result addGoods(@RequestBody GoodInfoDto goodInfoDto){
        addGoodsService.Goodsadd(goodInfoDto);
        return Result.success("新增货物成功！编号为："+goodInfoDto.getU_id());
    }

}
