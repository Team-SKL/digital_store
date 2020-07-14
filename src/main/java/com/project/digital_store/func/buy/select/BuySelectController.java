package com.project.digital_store.func.buy.select;

import com.project.digital_store.func.buy.detail.BuyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/buy/select")
public class BuySelectController {

    @Autowired
    private BuySelectService buySelectService;


}
