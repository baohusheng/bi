package com.top.bi.service.impl;

import com.top.bi.dao.LoginDao;
import com.top.bi.entity.User;
import com.top.bi.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
@Service
public class LoginServiceImpl implements LoginService {
    @Resource
    private LoginDao loginDao;
    @Override
    public Integer loginCheck(User user) {
        return loginDao.LoginCheck(user);
    }
}
