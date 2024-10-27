package com.hari.springboot.learnspringboot.configurationProperties;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.SQLOutput;

@Component
public class AppPropertiesDemo {
    @Autowired
    private AppProperties appProperties;

    public void display(){
        System.out.println(appProperties.getName());
        System.out.println(appProperties.getDescription());
        System.out.println(appProperties.getUploadDir());
        System.out.println(appProperties.getSecurity().getUserName());
        System.out.println(appProperties.getSecurity().getPassword());
        System.out.println(appProperties.getSecurity().getRoles());
        System.out.println(appProperties.getSecurity().isEnable());
        System.out.println(appProperties.getSecurity().getPermissions());

    }

}
