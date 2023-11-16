package com.pkg.overriding;

public class Test1 extends Test2 {

	public void test() {
		System.out.println("This is Test1");
		super.test();
	}

}
