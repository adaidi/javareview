/**
 *
 */
package com.canway.gz.oop.spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author Administrator
 * @date 2018年6月13日 上午9:18:48
 * 
 */
public class OrderAopTest {

	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		BeanFactory beanFactory = new ClassPathXmlApplicationContext("classpath:classpath.xml");
		OrderAopService orderAop =(OrderAopService) beanFactory.getBean("OrderAopServiceImpl");
		orderAop.add();
		orderAop.mod();
	}

}
