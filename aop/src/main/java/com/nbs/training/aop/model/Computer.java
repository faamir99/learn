package com.nbs.training.aop.model;

import org.springframework.stereotype.Component;

@Component
public class Computer extends Device {
	public void show() {
		System.out.println("I am a Computor");
	}
}
