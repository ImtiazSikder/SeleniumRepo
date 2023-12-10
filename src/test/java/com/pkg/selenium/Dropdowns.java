package com.pkg.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static void main(String[] args) {
		
		WebDriver driver;
		
		driver = new FirefoxDriver();
		driver.get("https://demo.nopcommerce.com/register");
		
		WebElement ele=driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
		selectDropDown(ele, "17");
		WebElement ele2=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
		selectDropDown(ele2, "December");
	}
	
	public static void selectDropDown(WebElement element, String value) {
		Select select=new Select(element);
		List<WebElement> allOptions=select.getOptions();
		
		for(int i=1; i<allOptions.size(); i++) {
			if(allOptions.get(i).getText().equals(value)) {
				allOptions.get(i).click();
			}
		}
	}
}
	//Display All the Links 
		
	

		
		
		
		
		
		
		
		
		
		























		
		
		
		
		
		
		
		
		
		/*
		
		public static void main(String[] args) {
			
			WebDriver driver;
			
			driver = new FirefoxDriver();
			driver.get("https://demo.nopcommerce.com/register");
		
			List<WebElement> elements=driver.findElements(By.tagName("a"));
			findLinks(elements,"YouTube");
		}
		
		//Display All the Links 
			public static void findLinks(List<WebElement> eleLinks , String values) {
				for(int i=0; i<eleLinks.size(); i++) {
					if(eleLinks.get(i).getText().equals(values)) {
						System.out.println(eleLinks.get(i).getText()+"  Found at Position " + (i+1));
						break;
					}
				}
			}
		
*/

//
//WebElement eleDay=driver.findElement(By.name("DateOfBirthDay"));
//Select select =new Select(eleDay);
//select.selectByVisibleText("17");
//
//WebElement eleMonth=driver.findElement(By.name("DateOfBirthMonth"));
//Select selectM =new Select(eleMonth);
//selectM.selectByVisibleText("December");
//
//WebElement eleYear=driver.findElement(By.name("DateOfBirthYear"));
//Select selectY=new Select(eleYear);
//selectY.deselectByVisibleText("2023");


		
//		
//		WebElement eleMon=driver.findElement(By.name("DateOfBirthMonth"));
//		Select selectM=new Select(eleMon);
//		
//		List<WebElement> weOption= selectM.getOptions();
//		
//		for(int i=0; i<weOption.size(); i++) {
//			if(weOption.get(i).getText().equals("December")) {
//				weOption.get(i).click();
//				break;
//			}
//		}
//		
		
		
		
		
		
		
		
		
		
		
//		WebElement eleY=driver.findElement(By.+name("DateOfBirthYear"));
//		Select selectY=new Select(eleY);
//		
//		List<WebElement> weYear=selectY.getOptions();
//		
//		for(int i=0; i<weYear.size(); i++) {
//			if(weYear.get(i).getText().equals("2020")) {
//				weYear.get(i).click();
//				break;
//			}
//		}
//		
//		
		
		
		
		
		
		
		
		
		
		
			
//		for(WebElement ele: listOptions) {
//			if(listOptions.equals("17")) {
//				ele.click();
//			}
//		}


 





































		
		
//		//Call Method
//		WebElement eleDay = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
//		selectOptionFromDropDown(eleDay,"12");
//		
//		WebElement eleMon=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
//		selectOptionFromDropDown(eleMon,"December");
//		                                
//		WebElement eleYear=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
//		selectOptionFromDropDown(eleYear,"2023");
//		
//		
//		
//		
		
		
		
		//Dropdowns
		
		//Day
//		WebElement ele = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
//		
//		Select select = new Select(ele);
//		select.selectByIndex(13);
//		
//		//Month
//		WebElement eleMonth=driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
//		Select selectM = new Select(eleMonth);
//		selectM.selectByVisibleText("September");

//		//Year
//		WebElement eleY=driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
//		Select selectY = new Select(eleY);
//		selectY.selectByVisibleText("2013");
		
//	}	
	
		/*public static void selectOptionFromDropDown(WebElement ele, String value){
			Select select=new Select(ele);
			List<WebElement> allOptions=select.getOptions();
			
			for(WebElement option:allOptions){
				if(option.getText().equals(value)) {
					option.click();
					break;
				}
			}
		}
		}
	
		*/
		
		

