package com.java;

public class ReverseNumber {

	public static void main(String[] args) {
		
		int num=123456;
		StringBuffer sb=new StringBuffer(String.valueOf(num));
		StringBuffer s=sb.reverse();
		System.out.println(s);
}
}
































//		int num=12345;
//		int rev=0;
//		
//		while(num!=0) {
//			rev=rev*10 + num%10;
//			num=num/10;
//		}
//
//		System.out.println(rev);
	


