package com.anil.didemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.anil.didemo.controller.MyController;

@SpringBootApplication
public class DependencyInjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext run = SpringApplication.run(DependencyInjectionDemoApplication.class, args);
		MyController bean = (MyController) run.getBean("myController");
		bean.hello();
	}
}
