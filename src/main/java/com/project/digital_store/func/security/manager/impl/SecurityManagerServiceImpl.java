package com.project.digital_store.func.security.manager.impl;


import com.project.digital_store.base.UserStausEnum;
import com.project.digital_store.func.security.manager.SecurityManagerDao;
import com.project.digital_store.func.security.manager.SecurityManagerService;
import com.project.digital_store.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)//声明本对象所有方法都是事务性的 rollback回滚
public class SecurityManagerServiceImpl implements SecurityManagerService {

    @Autowired
    private SecurityManagerDao securityManagerDao;

    @Override
    public List<User> getUserList() {
        return securityManagerDao.findUserList();
    }

    @Override
    public void unuseUser(String u_id) {

        securityManagerDao.changeUserStaus(u_id, UserStausEnum.已启用.getCode(),UserStausEnum.已禁用.getCode());
    }

    @Override
    public void useUser(String u_id) {
        securityManagerDao.changeUserStaus(u_id, UserStausEnum.已禁用.getCode(),UserStausEnum.已启用.getCode());
    }

    @Override
    public void unuseSeller(String u_id) {
        securityManagerDao.changeSellerStaus(u_id, UserStausEnum.已启用.getCode(),UserStausEnum.已禁用.getCode());
    }

    @Override
    public void useSeller(String u_id) {
        securityManagerDao.changeSellerStaus(u_id, UserStausEnum.已禁用.getCode(),UserStausEnum.已启用.getCode());
    }
}
