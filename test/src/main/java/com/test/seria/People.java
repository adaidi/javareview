package com.test.seria;

import java.io.Serializable;

public class People implements Serializable{
	
	public String name;
	
	public Integer age;

	@Override
	public String toString() {
		return "People [name=" + name + ", age=" + age + "]";
	}
	
	
	
}
