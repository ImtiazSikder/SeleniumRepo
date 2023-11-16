package com.selenium.methods;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class AlertMethods {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new FirefoxDriver();
		
		//URL
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		
	//1)
		//Clicking on Button
		//driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		//Calling the method
		//okAlert();

		
	//2)
		//Clicking on Button
		//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		//Calling the method
		//cancelAlert();
		
		
	//3)
		//Clicking on Button
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		//Calling the method
		//sendKeysMethoda("Welcome");
			
	}
	
	
	
	
	
	//Methods;	
	//===============================	
 
//	public static void sendKeysMethoda(String value) {
//		Alert alert=driver.switchTo().alert();
//		alert.sendKeys(value);
//		alert.accept();
//	}
//	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	public static void okAlert() {
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	
	
	public static void cancelAlert() {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
	}
	
	
	public static void getTextAlert() {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Welcome");
		alert.accept();
	}
	
	*/
	
	
	
	

