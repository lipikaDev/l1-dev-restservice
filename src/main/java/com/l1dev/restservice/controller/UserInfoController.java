package com.l1dev.restservice.controller;

import com.l1dev.restservice.domain.UserInfo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserInfoController {

    @RequestMapping("/user-info")
    public UserInfo userInfo(@RequestParam(value = "userName", defaultValue = "NoName") String userName, String userText) {
        return new UserInfo(userName, userText);
    }



}
