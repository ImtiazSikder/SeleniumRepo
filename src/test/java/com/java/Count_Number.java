package com.java;

public class Count_Number {

	public static void main(String[] args) {
		//Count number of Digits in a number
		
		int num=123456;
		int count=0;
		
		while(num>0) {
			num=num/10;
			count++;
		}
		System.out.println("Number of digits in a number is: " + count);

	}

}
