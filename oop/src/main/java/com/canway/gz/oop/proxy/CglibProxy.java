package com.canway.gz.oop.proxy;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class CglibProxy implements MethodInterceptor {
		
	private Enhancer  enhancer= new Enhancer();
	
	public Object getProxy(Class clazz) {
		enhancer.setSuperclass(clazz);
		enhancer.setCallback(this);
		return enhancer.create();
	}
	
	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		// TODO Auto-generated method stub
		Long a = System.currentTimeMillis();
		Object result = proxy.invokeSuper(obj,args);
		Long b = System.currentTimeMillis();
		System.out.println("这里是CGLIB动态代理方法调用耗时：" + (b - a));
		return result;
	}



}
