package com.hari.springboot.learnspringboot;

import ch.qos.logback.core.Context;
import com.hari.springboot.learnspringboot.configurationProperties.AppPropertiesDemo;
import com.hari.springboot.learnspringboot.configurationProperties.PropertySource;
import com.hari.springboot.learnspringboot.controller.PizzaController;
import com.hari.springboot.learnspringboot.service.NonVegPizza;
import com.hari.springboot.learnspringboot.service.VegPizza;
import jakarta.el.BeanNameResolver;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class LearnSpringBootApplication {

	public static void main(String[] args) {


		var context = SpringApplication.run(LearnSpringBootApplication.class, args);
	//	AppPropertiesDemo appPropertiesDemo = context.getBean(AppPropertiesDemo.class);
		//		appPropertiesDemo.display();
//		 NonVegPizza nonVegPizza = context.getBean(NonVegPizza.class);
//		System.out.println(nonVegPizza.getPizza());


//		PizzaController pizzaController = context.getBean(PizzaController.class);
//		System.out.println(pizzaController.pizza());

		PropertySource propertySource = context.getBean(PropertySource.class);
		System.out.println(propertySource.getHost());
		System.out.println(propertySource.getGmail());
		System.out.println(propertySource.getPassword());
		System.out.println(propertySource.getName());
		System.out.println(propertySource.getDescription());
		System.out.println(propertySource.getDef());
		System.out.println(propertySource.getHome());
		System.out.println(propertySource.getJavaHome());


	}

	
}
