package com.l1dev.restservice.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class NewTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String userName;
    private String userText;
    private LocalDateTime addedAtTime;
    private String userCity;
    private String userCountryCode;
    private BigDecimal geoLatitude;
    private BigDecimal geoLongitude;
    private BigDecimal temperatureCelcius;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserText() {
        return userText;
    }

    public void setUserText(String userText) {
        this.userText = userText;
    }

    public LocalDateTime getAddedAtTime() {
        return addedAtTime;
    }

    public void setAddedAtTime(LocalDateTime addedAtTime) {
        this.addedAtTime = addedAtTime;
    }

    public String getUserCity() {
        return userCity;
    }

    public void setUserCity(String userCity) {
        this.userCity = userCity;
    }

    public String getUserCountryCode() {
        return userCountryCode;
    }

    public void setUserCountryCode(String userCountryCode) {
        this.userCountryCode = userCountryCode;
    }

    public BigDecimal getGeoLatitude() {
        return geoLatitude;
    }

    public void setGeoLatitude(BigDecimal geoLatitude) {
        this.geoLatitude = geoLatitude;
    }

    public BigDecimal getGeoLongitude() {
        return geoLongitude;
    }

    public void setGeoLongitude(BigDecimal geoLongitude) {
        this.geoLongitude = geoLongitude;
    }

    public BigDecimal getTemperatureCelcius() {
        return temperatureCelcius;
    }

    public void setTemperatureCelcius(BigDecimal temperatureCelcius) {
        this.temperatureCelcius = temperatureCelcius;
    }
}
