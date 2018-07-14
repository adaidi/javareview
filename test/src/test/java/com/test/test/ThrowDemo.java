package com.test.test;

public class ThrowDemo extends Throw {
	
	@Override
	void myThow() /* throws 表达式 */ {
		try {
			myThow_1(7, 0);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
//		throw new RuntimeException("运行时异常");
	}

	public static void main(String[] args) {
		new ThrowDemo().myThow();
	}
}

class Throw {
	void myThow() throws ArithmeticException, InterruptedException {
		myThow_1(3, 6);
	}

	int myThow_1(int x, int y) throws ArithmeticException {
		return x / y;
	}
}
