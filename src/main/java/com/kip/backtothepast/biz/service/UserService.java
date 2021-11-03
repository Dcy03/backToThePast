package com.kip.backtothepast.biz.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.kip.backtothepast.biz.model.User;

/**
 * @author Dcy
 */
public interface UserService extends IService<User> {


    boolean saveUser(User user);
}
