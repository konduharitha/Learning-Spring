package com.hari.springboot.learnspringboot.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


public class NonVegPizza implements Pizza{
    @Override
    public String getPizza() {
        return "Non veg Pizza";
    }
}
