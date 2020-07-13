package com.project.digital_store.func.buy.detail;

import com.project.digital_store.dto.GoodInfoDto;

public interface BuyDetailService {


    GoodInfoDto getGoodInfo(String u_id,String g_id);
}
