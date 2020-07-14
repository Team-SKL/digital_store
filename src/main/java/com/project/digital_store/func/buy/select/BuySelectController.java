package com.project.digital_store.func.buy.select;

import com.project.digital_store.dto.GoodsDto;
import com.project.digital_store.func.buy.detail.BuyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/buy/select")
public class BuySelectController {

    @Autowired
    private BuySelectService buySelectService;

    @GetMapping("/{info}")
    public List<GoodsDto> selectGoods(@PathVariable String info){
        return buySelectService.getselectGoods(info);
    }


}
