package com.pkg.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetWindowHandles {
	//URL:=== driver.get("https://opensource-demo.orangehrmlive.com/");
	//driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Thread.sleep(5000);	
		Set<String> windowIDs=driver.getWindowHandles();
		List<String> listWindowIDs=new ArrayList<String>(windowIDs);//converting Set to List
		
		for(String winIDs: listWindowIDs) {
			String title=driver.switchTo().window(winIDs).getTitle();
			System.out.println(title);
		}
		
	}
}

























//		Set<String> windowIDs=driver.getWindowHandles();
//		List<String> listWindowIDs=new ArrayList<String>(windowIDs); //converting Set to List
//		
//		for(String winIDs: listWindowIDs) {
//			String title=driver.switchTo().window(winIDs).getTitle();
//			System.out.println(title);
//		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
		
		
//		//getWindowHandles
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
//		
//		Set<String> windowIDs=driver.getWindowHandles();
//		
//		Iterator<String> it=windowIDs.iterator();
//		String parentWindowID=it.next();
//		String childWindowID=it.next();
//		
//		System.out.println("Parent window ID is: "+ parentWindowID);
//		System.out.println("Child window ID is: "+ childWindowID);

		
		














//Clicking on the Link

//Thread.sleep(5000);  
//driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();


//getWindowHandles
//Set<String> windowHandles=driver.getWindowHandles();
//
//Iterator<String> it=windowHandles.iterator();
//
//String parentWindowID=it.next();
//String childWindowID=it.next();
//
//System.out.println("Parant window ID: " + parentWindowID);
//System.out.println("Child window ID: "+ childWindowID);










//Set<String> windowIDs=driver.getWindowHandles();		
//List<String> windowIDsList= new ArrayList<String>(windowIDs); //Converting Set to List
//Thread.sleep(5000);
//for(String winID: windowIDsList) {
//	String title=driver.switchTo().window(winID).getTitle();
//	System.out.println(title);
//}
