package com.pkg.java;

public class CountSumInANumber {

	public static void main(String[] args) {
		//Count sum of a number 
		
		int num=3987;
		int sum=0;
		
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of a number is: " + sum);
		
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		/*
		int num=123456;
		int sum=0;
		
		while(num>0) {
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	*/