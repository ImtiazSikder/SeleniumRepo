package com.java;

public class Fibonacce_Series {
	
	//A series of numbers in which each number is the sum of the two preceding numbers.
	
	public static void main(String[] args) {
		int n1=0, n2=1, sum=0;
		System.out.print(n1+ " "+n2 + " ");
		
		for(int i=2; i<10; i++) {
			sum=n1+n2;
			System.out.print(" " + sum);
			n1=n2;
			n2=sum;
		}
	}
}
	






























//		int n1=0, n2=1, sum=0;
//		System.out.print(n1+" "+n2);
//		
//		for(int i=2; i<10; i++) {
//			sum=n1+n2;
//			System.out.print(" "+ sum);
//			n1=n2;
//			n2=sum;
//		}

	


