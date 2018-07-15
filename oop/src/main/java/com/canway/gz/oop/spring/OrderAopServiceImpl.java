package com.canway.gz.oop.spring;

import org.springframework.stereotype.Component;

@Component
public class OrderAopServiceImpl implements OrderAopService{
	
	public void add() throws InterruptedException {
		Long a = System.currentTimeMillis();
		System.out.println("我是新增方法");
		Thread.sleep(3000);
		Long b = System.currentTimeMillis();
		System.out.println("新增方法消耗时间一共是："+ (b-a));
	}
	
	public void mod() throws InterruptedException {
		Long a = System.currentTimeMillis();
		System.out.println("我是修改方法");
		Thread.sleep(2000);
		Long b = System.currentTimeMillis();
		System.out.println("修改方法消耗时间："+ (b-a));
	}
	
	
	public void del() throws InterruptedException {
//		Long a = System.currentTimeMillis();
		System.out.println("我是删除方法");
		Thread.sleep(1000);
//		Long b = System.currentTimeMillis();
//		System.out.println("删除方法消耗时间："+ (b-a));
	}
	
	

}
