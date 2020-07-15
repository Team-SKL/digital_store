package com.project.digital_store.func.buy.detail;

import com.project.digital_store.dto.GoodInfoDto;

public interface BuyDetailService {


    GoodInfoDto getGoodInfo(String g_id);

    void Cartadd(String g_id);
}
