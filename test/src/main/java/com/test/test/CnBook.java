package com.test.test;

import java.io.Serializable;

public class CnBook extends Book  implements BookInterface{

	@Override
	public void detail() {
		System.out.println("这里是语文书。。。。");
	}

	
//	//详细方法
//	public void detail() {
//		System.out.println("这里是语文书");
//	}
		
		
		
}
