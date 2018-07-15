/**
 *
 */
package com.canway.gz.oop.proxy;

import com.canway.gz.oop.spring.OrderAopService;
import com.canway.gz.oop.spring.OrderAopServiceImpl;

/**
 * @author Administrator
 * @date 2018年6月12日 下午9:22:27
 * 
 */
public class OrderAopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		orderAopTestCglib();
	}
	
	public static void orderAopTestCglib() {
		CglibProxy proxy = new CglibProxy();
		OrderAopService serve1 = new OrderAopServiceImpl();
		OrderAopService orderAopService = (OrderAopService) proxy.getProxy(OrderAopServiceImpl.class);
		System.out.println(orderAopService);
		try {
			orderAopService.add();
			orderAopService.mod();
			orderAopService.del();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		
	}

}
