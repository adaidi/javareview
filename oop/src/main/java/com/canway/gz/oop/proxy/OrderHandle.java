package com.canway.gz.oop.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import org.springframework.stereotype.Component;

@Component
public class OrderHandle implements InvocationHandler {

	private Object target;
	

	
	public  OrderHandle(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		Long a = System.currentTimeMillis();
		Object obj = method.invoke(target, args);
		Long b = System.currentTimeMillis();
		System.out.println("这里是JDK动态代理方法调用耗时：" + (b - a));
		return obj;
	}

}
