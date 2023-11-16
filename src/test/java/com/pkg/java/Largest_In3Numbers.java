package com.pkg.java;

public class Largest_In3Numbers {

	
	public static void main(String[] args) {
		int a=40; 
		int b=60; 
		int c=30;
		
		if(a>b && a>c) {
			System.out.println("a is largest " + a);
		}else if(b>a && b>c) {
			System.out.println("b is largest " + b);
		}else {
			System.out.println("c is largest "+ c);
		}
	}
}
