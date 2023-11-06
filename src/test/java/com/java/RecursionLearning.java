package com.java;

public class RecursionLearning {

	public static void main(String[] args) {
		
		tvDisplay();
	}
	
	static int count =0;
	public static void tvDisplay() {
		count++;
		if(count<10) {
			System.out.println("Tvdisplay!!!!");
			tvDisplay();
		}
	}
	

}





















//static int count=0;
//public static void tvDisplay() {
//	count++;
//	if(count<10) {
//		System.out.println("This is tvdisplay");
//		tvDisplay();
//	}
//}
