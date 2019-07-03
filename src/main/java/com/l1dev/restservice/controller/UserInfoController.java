package com.l1dev.restservice.controller;

import com.l1dev.restservice.Repository.UserInfoRepository;
import com.l1dev.restservice.model.NewTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@RestController
public class UserInfoController {

    @Autowired
    UserInfoRepository userInfoRepository;

    @RequestMapping("/user-info")
    public NewTable userInfo(@RequestParam String requestUserName,
                             @RequestParam String requestUserText,
                             @RequestParam String requestUserCity) {


        NewTable userInfo = new NewTable();
        userInfo.setUserName(requestUserName);
        userInfo.setUserText(requestUserText);
        userInfo.setAddedAtTime(LocalDateTime.now());
        userInfo.setUserCity(requestUserCity);
        userInfo.setUserCountryCode("");
        userInfo.setGeoLatitude(BigDecimal.ZERO);
        userInfo.setGeoLongitude(BigDecimal.ZERO);
        userInfo.setGeoLongitude(BigDecimal.ZERO);

        System.out.println(userInfo);
        userInfoRepository.save(userInfo);

        return userInfo;

    }


}
