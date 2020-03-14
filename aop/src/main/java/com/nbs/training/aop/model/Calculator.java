package com.nbs.training.aop.model;

import org.springframework.stereotype.Component;

import com.nbs.training.aop.annotation.Loggable;

@Component
public class Calculator extends Device {

	public void show() {
		System.out.println("I am a Calculator");
	}

















	public String performAddition(int a, int b) {
		System.out.println("Adding numbers " + a + " and " + b);
		return "Result: " + (a + b);
	}

	public String performSubtraction(int a, int b) {
		System.out.println("Subtracting numbers " + a + " and " + b);
		return "Result: " + (a - b);
	}

	public String performSubtractionWithException(int a, int b) {
		System.out.println("Subtracting numbers " + a + " and " + b);
		throw(new RuntimeException());
	}

	@Loggable
	public String performSubtractionWithAnnotation(int a, int b) {
		System.out.println("Subtracting numbers " + a + " and " + b);
		return "Result: " + (a - b);
	}
}
