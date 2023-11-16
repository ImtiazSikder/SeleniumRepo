package com.pkg.java;

public class LargestNumberInArray {

	public static void main(String[] args) {
	//Find Largest number in an Array
	
//		int a[]= {50, 20, 60, 30, 10, 70};
//		int largest=a[0];
//		
//		for(int i=1; a.length; i++) {
//			if(a[i]==largest) {
//				largest=a[i];
//			}
//		}
//		System.out.println("Largest number is: "+ largest);
	
		
		
		
		int a[]= {10, 30, 40, 70, 20};
		int largest=a[0];
		
		for(int i=1; i<a.length; i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
		}
		
		System.out.println("Largest number is: "+ largest);
	}
}
