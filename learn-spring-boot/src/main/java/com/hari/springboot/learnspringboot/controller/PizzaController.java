package com.hari.springboot.learnspringboot.controller;

import com.hari.springboot.learnspringboot.service.Pizza;
import com.hari.springboot.learnspringboot.service.VegPizza;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//@Component

public class PizzaController {

   // @Qualifier("vegPizza")
    private Pizza pizza;

//    @Autowired
//    public void setVegPizza(VegPizza vegPizza) {
//        this.vegPizza = vegPizza;
//    }


    //@Autowired
    public PizzaController(Pizza pizza){
        this.pizza = pizza;
    }



    public String pizza(){
        return pizza.getPizza();
    }

    public void init(){
        System.out.println("Initialization logic");
    }

    public void destroy(){
        System.out.println("Destroy logic");
    }
}
