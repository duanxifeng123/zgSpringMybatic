package org.zg.shop.service;

import org.zg.shop.model.UserInfo;

import java.util.List;

/**
 * Created by duanxifeng on 2016-8-6.
 */
public interface UserService {

    UserInfo getUserById(int id);

    List<UserInfo> getUsers();

    int insert(UserInfo userInfo);
}
