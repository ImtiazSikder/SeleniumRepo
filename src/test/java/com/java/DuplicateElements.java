package com.java;

public class DuplicateElements {

	public static void main(String[]args) {
		
		String[] a= {"java", "selenium", "c#", "Python", "java"};
		
		boolean flag=false;
		for(int i=0; i<a.length; i++)
		{
			for(int j=i+1; j<a.length; j++) {
				if(a[i]==a[j]) {
					System.out.println("Duplicate element found is: "+ a[i]);
					flag=true;
				}
			}
			if(flag==false) {
				System.out.println("Element not found");
			}
		}
				}
}
