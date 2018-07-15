package com.canway.gz.oop.aop.annotation;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OrderAnnotation {
	
	@Pointcut("execution(* com.canway.gz.oop.spring..*.*(..))")
	private void anyMethod() {	}
	
	
	
	@Before("anyMethod()")
	public void before() {
		System.out.println("这里是Aspect前置通知");
	}
	
	@After("anyMethod()")
	public void after() {
		System.out.println("这里是Aspect后者after通知");
	}
}
