package com.java;

public class Largest_In3Numbers {

	
	public static void main(String[] args) {
		int a=40;
		int b=60;
		int c=30;
		
		if(a>b && a>c) {
			System.out.println("Largest number is: a = "+ a);
		}else if(b>a && b>c) {
			System.out.println("Largest number is: b = "+ b);
		}else{
			System.out.println("Largest numner is: c = "+ c);
		}
	}
}
