package com.canway.gz.oop.proxy;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Proxy;

import com.canway.gz.oop.spring.OrderAopService;
import com.canway.gz.oop.spring.OrderAopServiceImpl;

public class JdkProxyEasyTest {
	
	
	public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, InterruptedException {
		jdkNormal();
	 
	}
	
	public static void jdkNormal() throws InterruptedException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {	       
	       //获取动态代理类
	        Class<?> proxyClazz = Proxy.getProxyClass(OrderAopService.class.getClassLoader()
	        		,OrderAopService.class);
	        //获得代理类的构造函数，并传入参数类型InvocationHandler.class
	        Constructor<?> constructor = proxyClazz.getConstructor(InvocationHandler.class);
	        //通过构造函数来创建动态代理对象，将自定义的InvocationHandler实例传入
	        OrderAopService iHello = (OrderAopService) constructor.newInstance(
	        		new OrderHandle(new OrderAopServiceImpl()));
	        System.out.println(iHello);
	        //通过代理对象调用目标方法
	        iHello.add();
	        iHello.mod();
	        iHello.del();
	}
	
	public static void jdkEasy() throws InterruptedException {
		  OrderAopService  orderService = (OrderAopService) Proxy.newProxyInstance(
	    		   OrderAopService.class.getClassLoader(),  //加载接口的类加载器
	               new Class[]{OrderAopService.class},      //一组接口
	               new OrderHandle(new OrderAopServiceImpl())); //自定义的InvocationHandler
		  System.out.println(orderService); 
		  orderService.add();
	       orderService.mod();
	       orderService.del();
	}
	
	
	
	
}
