package com.canway.gz.oop.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.canway.gz.oop.encapsulation.Bus;

@Component
public class HelloWorld {
	
	@Autowired
	private Bus bus;
	
	public void sayHello() {
		bus.forward();
		System.out.println("hello world");
	}
}
