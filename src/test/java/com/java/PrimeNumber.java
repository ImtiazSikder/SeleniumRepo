package com.java;

public class PrimeNumber {

	public static void main(String[] args) {
		
		System.out.println("10 is Prime Number: " + isPrimeNumber(10));
		System.out.println("17 is Prime Number: " + isPrimeNumber(17));
		System.out.println("7 is Prime Number: " + isPrimeNumber(7));
		
		getNumber(50);
	}	
	
	
	public static boolean isPrimeNumber(int num) {
		if(num<=0) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num%i==0) {
				return false;
			}
		}
		return true;
	}

	
	public static void getNumber(int num) {
		for(int i=2; i<=num; i++) {
			if(isPrimeNumber(i)) {
				System.out.println(i);
			}
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}



























//public static boolean isPrimeNumber(int num) {
//	if(num<=1) {
//		return false;
//	}
//	
//	for(int i=2; i<num; i++) {
//		if(num%i==0) {
//			return false;
//		}
//	}
//	return true;
//}




//public static void getNumber(int num) {
//	for(int i=2; i<=num; i++) {
//		if(isPrimeNumber(i)) {
//			System.out.println(i+" ");
//		}
//	}
//}
