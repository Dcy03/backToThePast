package com.kip.backtothepast.biz.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.kip.backtothepast.biz.dao.UserDao;
import com.kip.backtothepast.biz.model.User;
import com.kip.backtothepast.biz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Dcy
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserDao, User> implements UserService {

    @Autowired
    private UserService userService;

    @Override
    public boolean saveUser(User user) {
        return userService.saveOrUpdate(user);
    }
}
