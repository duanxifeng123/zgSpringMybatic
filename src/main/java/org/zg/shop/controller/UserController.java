package org.zg.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.zg.shop.common.EasyuiJsonData;
import org.zg.shop.model.UserInfo;
import org.zg.shop.service.UserService;

import java.util.List;

/**
 * Created by duanxifeng on 2016-8-6.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/showInfo/{userId}")
    public String showUserInfo(ModelMap modelMap, @PathVariable int userId){
        UserInfo userinfo=userService.getUserById(userId);
        modelMap.addAttribute("userinfo",userinfo);
        return "/user/showInfo";
    }

    @RequestMapping("showInfo")
    public @ResponseBody Object showUserInfo(){
        List<UserInfo> userInfos=userService.getUsers();
        return userInfos;
    }


    @RequestMapping("showUserList")
    public @ResponseBody Object showUserList(){
        List<UserInfo> userInfos=userService.getUsers();
        EasyuiJsonData easyuiJsonData=new EasyuiJsonData();
        easyuiJsonData.setTotal("100");
        easyuiJsonData.setRows(userInfos);
        return easyuiJsonData;
    }

}
