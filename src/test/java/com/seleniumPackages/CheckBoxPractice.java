package com.seleniumPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxPractice {
	//	Url to practice Automation
	//	https://testautomationpractice.blogspot.com/
	
	public static void main(String[] args) {
		
		WebDriver driver;
		driver=new FirefoxDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		//Select Sunday)	
		
		//Select all Check Boxes
		
		List<WebElement> allChecks=driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));
		for(int i=0; i<allChecks.size(); i++) {
			allChecks.get(i).click();			
		}
		
		
		//Select last 3 check boxes	

		
		
		
		//Select only 'Friday' and 'Sunday'
		/*
		List<WebElement> eleChecks=driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));
		
		for(WebElement check: eleChecks) {
			String specificCheck=check.getAttribute("id");
			if(specificCheck.equals("friday") || specificCheck.equals("sunday")) {
				check.click();
			}
		}

		*/
	}
		
		
		
		
		
		
		
		
		
//		List<WebElement> listEle=driver.findElements(By.xpath("//input[@type='checkbox' and contains (@id,'day')]"));
//
//		for(WebElement ele: listEle) {
//			String specificEle= ele.getAttribute("id");
//			
//			if(specificEle.equals("friday")|| specificEle.equals("wednesday")) {
//				ele.click();
//			}
//		}
//		
	
}
	



























//		Url to practice Automation
//		https://testautomationpractice.blogspot.com/
		
//		
//		WebDriver driver;
//		driver=new FirefoxDriver();
//		
//		driver.get("https://testautomationpractice.blogspot.com/");
//		
//		//Select Monday
//		//driver.findElement(By.id("friday")).click();
//		
//		//Select All Day                                        
//		List<WebElement> listCheck=driver.findElements(By.xpath("//input[@type='checkbox'and contains (@id,'day')]"));
//																 
//System.out.println(listCheck.size());
//
//		//		for(int i=0; i<listCheck.size(); i++) {
////			listCheck.get(i).click();
////		}
//		
//		
//		//Select Only sunday and friday........
//		
////		for(WebElement eleCheck: listCheck)
////		{
////			String getSpecificEle=eleCheck.getAttribute("id");
////			if(getSpecificEle.equals("sunday") || getSpecificEle.equals("friday")){
////				eleCheck.click();
////			}
////		}
//		
//		
//		
//		
//		
//		//Select Last 2 elements

		//List<WebElement> listCheck=driver.findElements(By.xpath("//input[@type='checkbox'and contains (@id,'day')]"));
//		  int totChecks=listCheck.size();
//		  for(int i=totChecks-3; i<totChecks; i++) {
//			 listCheck.get(i).click();
//		}
//		
	


