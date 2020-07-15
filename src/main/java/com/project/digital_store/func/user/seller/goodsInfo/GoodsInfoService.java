package com.project.digital_store.func.user.seller.goodsInfo;

import com.project.digital_store.dto.GoodInfoDto;
import com.project.digital_store.dto.GoodsDto;
import com.project.digital_store.model.SellersGoods;

import java.util.List;

public interface GoodsInfoService {


    public List<GoodsDto> getshelvesGoods(String s_id);

    void deleteGoods(String[] gids);
}
