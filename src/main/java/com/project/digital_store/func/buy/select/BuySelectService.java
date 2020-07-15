package com.project.digital_store.func.buy.select;

import com.project.digital_store.dto.GoodsDto;

import java.util.List;

public interface BuySelectService {
    public List<GoodsDto> getselectGoods(String info);
}
