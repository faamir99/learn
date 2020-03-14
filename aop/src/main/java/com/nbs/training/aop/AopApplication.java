package com.nbs.training.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.nbs.training.aop.config.AppConfig;
import com.nbs.training.aop.model.Calculator;

public class AopApplication {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Calculator calculator = context.getBean(Calculator.class);

		calculator.show();
	}
}
