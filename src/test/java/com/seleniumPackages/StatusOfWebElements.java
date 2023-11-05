package com.seleniumPackages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class StatusOfWebElements {

	public static void main(String[] args) {
		WebDriver driver;
		
		driver = new FirefoxDriver();		
		driver.get("https://demo.nopcommerce.com/register");
		
		//isDisplayed----isEnabled
		
//		WebElement ele= driver.findElement(By.id("small-searchterms"));		
//		
//		System.out.println("Element status: " + ele.isDisplayed());
//		System.out.println("Element status: " + ele.isEnabled());
		
		
		
		//isSelected
		WebElement eleMale =driver.findElement(By.id("gender-male"));
		WebElement eleFemale =driver.findElement(By.id("gender-female"));
		
		eleMale.isSelected();
		eleFemale.isSelected();
		
		System.out.println("Status of Male Element is: "+ eleMale.isSelected());
		System.out.println("Status of Female Element is: "+ eleFemale.isSelected());
		
		eleMale.click();
		
		System.out.println("Status of Male Element is: "+ eleMale.isSelected());
		System.out.println("Status of Female Element is: "+ eleFemale.isSelected());
	}

}
