package com.pkg.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authentication_Alert {
	public static void main(String[] args) {
		
		//Authentication
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/basic_auth");
		//driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		

		
		//driver.get("https://the-internet.herokuapp.com/basic_auth");
					  //https://admin:admin123@the-internet.herokuapp.com/basic_auth
		
//		Alert alert =driver.switchTo().alert();
//		alert.sendKeys("Welcome");
//		alert.dismiss();
	}

}
