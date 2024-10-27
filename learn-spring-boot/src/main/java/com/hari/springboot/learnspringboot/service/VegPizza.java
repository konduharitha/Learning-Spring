package com.hari.springboot.learnspringboot.service;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;



public class VegPizza implements Pizza {



    @Override
    public String getPizza() {
        return "VegPizza";
    }
}
