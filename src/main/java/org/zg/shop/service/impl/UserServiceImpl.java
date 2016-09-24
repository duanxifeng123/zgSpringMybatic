package org.zg.shop.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.zg.shop.dao.UserInfoMapper;
import org.zg.shop.model.UserInfo;
import org.zg.shop.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by duanxifeng on 2016-8-6.
 */
@Service("userService")
public class UserServiceImpl implements UserService{

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public UserInfo getUserById(int id) {
        return userInfoMapper.selectByPrimaryKey(id);
    }
     @Override
    public List<UserInfo> getUsers() {
        return userInfoMapper.selectAll();
    }

     @Override
    public int insert(UserInfo userInfo) {
        return userInfoMapper.insert(userInfo);
    }
}
