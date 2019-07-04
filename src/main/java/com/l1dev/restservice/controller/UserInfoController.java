package com.l1dev.restservice.controller;

import com.l1dev.restservice.Repository.UserInfoRepository;
import com.l1dev.restservice.domain.GeoInfo;
import com.l1dev.restservice.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.validation.constraints.Null;
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


        RestTemplate restTemplate = new RestTemplate();
        GeoInfo geoInfo =
                restTemplate.getForObject("http://api.openweathermap.org/data/2.5/weather?q=Toronto&APPID=e866150e87b2e8ab6da4e8eda75efa5b", GeoInfo.class);

        UserInfo userInfo = new UserInfo();
        userInfo.setUserName(requestUserName);
        userInfo.setUserText(requestUserText);
        userInfo.setAddedAtTime(LocalDateTime.now());
        userInfo.setUserCity(requestUserCity);
        userInfo.setGeoLatitude(geoInfo.getCoord().getLat() != null ? geoInfo.getCoord().getLat() : BigDecimal.ZERO);
        userInfo.setGeoLongitude(geoInfo.getCoord().getLat() != null ? geoInfo.getCoord().getLon() : BigDecimal.ZERO);
        userInfo.setTemperatureCelsius(geoInfo.getMain().getTemp() != null ? geoInfo.getMain().getTemp() : BigDecimal.ZERO);

        userInfoRepository.save(userInfo);

        return userInfoRepository.findAll();

    }


}
