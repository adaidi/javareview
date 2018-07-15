package com.canway.gz.oop.encapsulation;

import org.springframework.stereotype.Component;


public class Car {
	
	private String engine;
	
	private String wheel;
	
	private String steeringWwheel;
	
	public void forward() {
		System.out.println("我正在前进");
	}
	
	public void back() {
		System.out.println("我正在后退");
	}
	
	
	public void brake() {
		System.out.println("我正在刹车");
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getWheel() {
		return wheel;
	}

	public void setWheel(String wheel) {
		this.wheel = wheel;
	}

	public String getSteeringWwheel() {
		return steeringWwheel;
	}

	public void setSteeringWwheel(String steeringWwheel) {
		this.steeringWwheel = steeringWwheel;
	}
	
	
}
