package com.selenium.methods;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown_Method {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(Duration,20);//I have to check why it's not working...
		driver.get("https://demo.nopcommerce.com/register");
		

		
		WebElement element=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		selectDropDown(element, "15");
	
	}
	
	
	
	//Drop Down Method
	//==================================================================
	
	public static void selectDropDown(WebElement ele, String value) {
		Select select=new Select(ele);
		List<WebElement> allOptions=select.getOptions();
		
		for(WebElement option: allOptions) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}
	
}






























//WebElement eleDay=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
//selectDropDown(eleDay, "12");
	//------------------------------------------------------------------------
//
//public static void selectDropDown(WebElement ele, String value) {
//	Select select = new Select(ele);
//	
//	List<WebElement> allOptions=select.getOptions();		
//	for(WebElement option: allOptions) {
//		if(option.getText().equals(value)) {			
//			option.click();
//			break;
//		}
//	}
//}
