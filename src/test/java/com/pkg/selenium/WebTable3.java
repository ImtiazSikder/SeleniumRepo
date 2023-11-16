package com.pkg.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable3 {

	public static void main(String []args) {
		
		WebDriver driver;
		
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://testautomationpractice.blogspot.com/");
		
		
		List<WebElement> names=driver.findElements(By.xpath("//table[@id='productTable']/tbody/tr/td[2]"));
		
		for(int i=0; i<names.size(); i++) {
			System.out.println(names.get(i).getText());
			if(names.get(i).getText().equals("Product 3")){
				System.out.println(names.get(i).getText()+"--- found at row number: "+ (i+1));
			}
		
		}
	}
}
