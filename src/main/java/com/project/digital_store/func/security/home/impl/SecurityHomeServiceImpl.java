package com.project.digital_store.func.security.home.impl;

import com.project.digital_store.dto.GoodsDto;
import com.project.digital_store.func.security.home.SecurityHomeDao;
import com.project.digital_store.func.security.home.SecurityHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SecurityHomeServiceImpl implements SecurityHomeService {

    @Autowired
    private SecurityHomeDao securityHomeDao;

    @Override
    public List<GoodsDto> getallGoods() {
        return securityHomeDao.getallGoods();
    }
}
