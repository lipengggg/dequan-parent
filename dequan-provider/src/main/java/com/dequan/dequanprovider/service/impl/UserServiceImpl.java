package com.dequan.dequanprovider.service.impl;

import com.dequan.common.annotation.log.SystemLog;
import com.dequan.dequanprovider.dao.UserDao;
import com.dequan.dequanprovider.entity.User;
import com.dequan.dequanprovider.service.UserService;
import com.dequan.common.enums.EnumLogType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @SystemLog(value = "业务层获取用户列表",logType = EnumLogType.SERVICE)
    public List<User> getList() {
        return userDao.selectList(null);
    }
}
