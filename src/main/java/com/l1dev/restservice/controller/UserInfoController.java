package com.l1dev.restservice.controller;

import com.l1dev.restservice.Repository.UserInfoRepository;
import com.l1dev.restservice.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@CrossOrigin("*")
@RestController
public class UserInfoController {

    @Autowired
    UserInfoRepository userInfoRepository;

    @RequestMapping(method = RequestMethod.GET, path = "/user-info")
    public Iterable<UserInfo> userInfo(@RequestParam String requestUserName,
                                       @RequestParam String requestUserText,
                                       @RequestParam String requestUserCity) {

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(requestUserName);
        userInfo.setUserText(requestUserText);
        userInfo.setAddedAtTime(LocalDateTime.now());
        userInfo.setUserCity(requestUserCity);
        userInfo.setGeoLatitude(BigDecimal.ZERO);
        userInfo.setGeoLongitude(BigDecimal.ZERO);
        userInfo.setTemperatureCelsius(BigDecimal.ZERO);

        userInfoRepository.save(userInfo);

        return userInfoRepository.findAll();

    }


}
