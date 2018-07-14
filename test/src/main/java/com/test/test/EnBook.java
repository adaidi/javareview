package com.test.test;

public class EnBook  extends Book implements BookInterface{
	
	//详细方法
	@Override
	public void detail() {
		System.out.println("这里是英语书");
	}
	
	
}
