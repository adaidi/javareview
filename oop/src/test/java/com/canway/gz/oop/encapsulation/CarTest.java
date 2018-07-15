package com.canway.gz.oop.encapsulation;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		fieldTest();
		polymorphism();
		try {
			classLoaderTest();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void fieldTest() {
		Method[] methods = Bus.class.getMethods();
		for(Method method : methods) {
			System.out.println("I am bus method : " + method.getName());
		}
		
		Field[] fields = Bus.class.getDeclaredFields();
		for(Field field : fields) {
			System.out.println("i am bus field : "+ field.getName());
		}
		
		
		Field[] superFields = Bus.class.getSuperclass().getDeclaredFields();
		for(Field field : superFields) {
			System.out.println("i am super field : "+ field.getName());
		}
		
		new Bus().forward();
	}
	
	
	public static void polymorphism() {
		Car car = new Car();
		
		Car carBus = new Bus();
		
		Car carTruck = new Truck();
		
		car.forward();
		
		carBus.forward();
		
		carTruck.forward();
	}
	
	
	
	public static void  classLoaderTest() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		 ClassLoader loader = Thread.currentThread().getContextClassLoader();
		 Class clazz = loader.loadClass("com.canway.gz.oop.encapsulation.Car");
		 Constructor cconstructor = clazz.getDeclaredConstructor(null);
		 Car car = (Car) cconstructor.newInstance(null);
		 Method method = clazz.getDeclaredMethod("setEngine", String.class);
		 method.invoke(car, "我是发动机");
		 Method getEngine = clazz.getDeclaredMethod("getEngine", null);
		 System.out.println(getEngine.invoke(car, null)); 
				 
	}

}
