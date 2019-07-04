package com.l1dev.restservice.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import java.util.Arrays;

public class Restserviceconfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity security) {
        try {
            security
                    .authorizeRequests()
                    .antMatchers("/user-info")
                    .permitAll();
        } catch (Exception e) {
            String stackTrace= Arrays.toString(e.getStackTrace());
        }
    }
}
