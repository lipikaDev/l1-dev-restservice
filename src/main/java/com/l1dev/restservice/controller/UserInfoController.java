package com.l1dev.restservice.controller;

import com.l1dev.restservice.Repository.UserInfoRepository;
import com.l1dev.restservice.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @Autowired
    UserInfoRepository userInfoRepository;

    @RequestMapping("/user-info")
    public Iterable<UserInfo> userInfo(@RequestParam String requestUserName,
                                       @RequestParam String requestUserText) {

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(requestUserName);
        userInfo.setUserText(requestUserText);
        userInfoRepository.save(userInfo);

        return userInfoRepository.findAll();

    }


}
