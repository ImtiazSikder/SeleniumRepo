package com.pkg.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class JS_Alert {
	static WebDriver driver;
	//Website:===    https://the-internet.herokuapp.com/javascript_alerts
	
	// Alert 'OK' or 'Cancel' 
	// Alert  'Text Box' -- 'OK' -- 'Cancel'
	// Alert 'Cancel'
	
	public static void main(String[] args) throws InterruptedException {

		driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");	
		
		//Click on Button
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		sendKeysAlert();
		
			 
		 }
	
	
		public static void sendKeysAlert() {
			Alert alert=driver.switchTo().alert();
			alert.sendKeys("Welcome");
			alert.accept();
		}
	
	
	

	
		//'OK' Alert	
//	   public void okAlert() {
//	       Alert alert = driver.switchTo().alert();
//	       alert.accept();
//	   }
	
	

	
//	   //Cancel Alert
//		 public void cancelAlert() {
//		       Alert alert = driver.switchTo().alert();
//		       alert.dismiss();
//		 }
//		 
//		 //'OK', 'Sendkeys' Alert
//		 public void sendKeysOKCancel(String value) {
//			 
//			 Alert alert = driver.switchTo().alert();
//			 alert.sendKeys(value);
//			 alert.accept();
//		}	
	
		public void sendKeysOK(String value) {
			Alert alert=driver.switchTo().alert();
			alert.sendKeys(value);
			alert.accept();			
		}
		
		public void OK() {
			Alert alert=driver.switchTo().alert();
			alert.accept();
		}
		
		public void Cancel() {
			Alert alert=driver.switchTo().alert();
			alert.dismiss();
		}
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		 
		 public void clickByUsingXPath(String locator) {
			 driver.findElement(By.xpath(locator)).click();
		 }

}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		//JS_Alert using 'OK' button
//		//------------------------------------
//		//Click on JS Button
	//		Thread.sleep(5000);
	//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
	//		//Accept the alert
	//		Thread.sleep(7000);
	//		driver.switchTo().alert().accept();
			
			
		
		//Alert using 'OK' or 'Cancel' button
			//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
			//Accept the alert
			//Thread.sleep(7000);
			//driver.switchTo().alert().accept();
			//driver.switchTo().alert().dismiss();
		
		
//		
//		//Alert using 'OK' and 'Cancel' and 'Text Box'
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Thread.sleep(5000);
//		
//		Alert alert=driver.switchTo().alert();
//		alert.getText();
//		alert.sendKeys("Welcome");
//		alert.accept();
		

