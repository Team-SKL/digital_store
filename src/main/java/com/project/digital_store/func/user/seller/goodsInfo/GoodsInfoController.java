package com.project.digital_store.func.user.seller.goodsInfo;

import com.project.digital_store.dto.GoodInfoDto;
import com.project.digital_store.dto.GoodsDto;
import com.project.digital_store.func.user.buyer.info.UserBuyerInfoService;
import com.project.digital_store.model.SellersGoods;
import com.project.digital_store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
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
}
