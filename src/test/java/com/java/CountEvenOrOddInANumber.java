package com.java;

public class CountEvenOrOddInANumber {

	public static void main(String[] args) {
		
		//Count number of Even or Odd in a number
		
		int num=123456;
		int evenCount=0;
		int oddCount=0;
		
		while(num>0) {
			int rem=num%10;
			
			if(rem%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num=num/10;
		}

		
		System.out.println("Number of EvenCount is: "+ evenCount);
		System.out.println("Number of OddCount is: "+ oddCount);
		
	}
}




















		
//		int num=123456;
//		int even_Count=0;
//		int odd_Count=0;
//		
//		while(num>0) {
//			int rem=num%10;
//			
//			if(rem%2==0) {
//				even_Count++;
//			}else {
//				odd_Count++;
//			}
//			num=num/10;
//		}
//		
//		System.out.println("Number of Even count: "+ even_Count);
//		System.out.println("Number of Odd count: "+ odd_Count);
	





















		
/*
		int num=123456;
		int evenCount=0;
		int oddCount=0;
		
		while(num>0){
			int rem=num%10;
			
			if(rem%2==0) {
				evenCount++;
			}else {
				oddCount++;
			}
			num=num/10;
		}
		System.out.println("Number of Even number is: "+evenCount);
		System.out.println("Number of Odd number is: "+oddCount);
		
		System.out.println("How are you");
		*/
