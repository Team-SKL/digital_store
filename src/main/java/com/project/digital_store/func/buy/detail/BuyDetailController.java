package com.project.digital_store.func.buy.detail;


import com.project.digital_store.dto.GoodInfoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RequestMapping("/buy/detail")
public class BuyDetailController {

    @Autowired
    private BuyDetailService buyDetailService;

    @GetMapping("/{u_id}&{g_id}")
    public GoodInfoDto GoodInfo(@PathVariable String u_id,@PathVariable String g_id){
        return buyDetailService.getGoodInfo(u_id,g_id);
    }

}
