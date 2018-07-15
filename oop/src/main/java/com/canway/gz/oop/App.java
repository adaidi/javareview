package com.canway.gz.oop;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InstantiationException, IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException
    {
        
        
//    	Person p1 = new Person();
    	Class clazz = Person.class;
    	Person p2 = (Person) clazz.newInstance();
    	System.out.println(p2);
    	Method[] methods = clazz.getDeclaredMethods();
    	for(Method m : methods) {
    		System.out.println(m.getName());
    	}
    	
    	Method setMethod = clazz.getDeclaredMethod("setName", String.class);
    	setMethod.invoke(p2,"张三");
    	setMethod.getParameters();
    	
    	System.out.println(p2);
    	
    	
    	
    	System.out.println("==========");
        Field[] fields = Person.class.getDeclaredFields();
        
        
        
        for(Field f : fields) {
        	System.out.println(f.getName());
        }
    }
}
