package com.hari.springboot.learnspringboot.configuration;

import com.hari.springboot.learnspringboot.controller.PizzaController;
import com.hari.springboot.learnspringboot.service.NonVegPizza;
import com.hari.springboot.learnspringboot.service.Pizza;
import com.hari.springboot.learnspringboot.service.VegPizza;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppConfig {

    @Bean
    public Pizza vegPizza(){
        return new VegPizza();
    }

    @Bean
    public Pizza nonVegPizza(){
        return new NonVegPizza();
    }

    @Bean( initMethod = "init", destroyMethod = "destroy")
    public PizzaController pizzaController(){
        return new PizzaController(vegPizza());
    }
}
