package com.seleniumPackages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class BootstrapDropdown {
	static WebDriver driver;
	
	public static void main(String[] args) throws Exception {
		System.out.println("Thi is Bootstrap");
		//For Firefox
		//driver.findElement(By.xpath("//*[@id='productType']")).click();
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		
	
	//	FirefoxOptions options=new FirefoxOptions();
	//	options.addArguments("--disable-notifications");			

		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.com/");			
		
		
		//Popups for Firefox
		//driver.findElement(By.xpath("//button[text()='Later']")).click();
	
		//To fix the size of Browser	
		Thread.sleep(5000);	
		Robot robot = new Robot();	
		System.out.println("About to zoom out");
		for (int i = 0; i < 2; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_SUBTRACT);
			robot.keyRelease(KeyEvent.VK_CONTROL);
		}	


		driver.findElement(By.xpath("//div[@class='dropdown-active-item product-category-active']")).click();
		List<WebElement> allOptions=driver.findElements(By.xpath("//ul[@class='product-tab-list product-category-list dropdown-active']/li"));
		selectDropDown(allOptions,"Refinance");
			
	
	}
	
	
	public static void selectDropDown(List<WebElement> ele, String value) {
		for(int i=0; i<ele.size(); i++) {
			if(ele.get(i).getText().equals(value)) {
				ele.get(i).click();
				break;
			}
		}
	}
	
		
	}
			
	
	


	
	

	
	
	
	
	
	



























		
/*
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='dropdown-active-item product-category-active']")).click();
		System.out.println("Drop Down selected.....");
		
		
		List<WebElement> listEle=driver.findElements(By.xpath("//ul[@class='product-tab-list product-category-list dropdown-active']/li"));
		
//		for(int i=0; i<listEle.size(); i++) {
//			if(listEle.get(i).getText().equals("Refinance")){
//				listEle.get(i).click();
//				break;
//			}
//		}
		
		for(WebElement ele: listEle) {
			if(ele.getText().equals("Refinance")) {
				ele.click();
				break;
			}
		}
*/
		
		
		
		
/*
		//Second Drop-Down
		driver.findElement(By.xpath("//div[@class='dropdown-active-item product-name-active']")).click();
	
		List<WebElement> listEle=driver.findElements(By.xpath("//ul[@class='product-tab-list product-name-list dropdown-active']/li"));
		
		for(WebElement ele: listEle) {
			if(ele.getText().equals("Plot Loans")) {
				ele.click();
				break;
			}
		}
*/
		
		
		



//	 
//	//Click on Drop Down
//	driver.findElement(By.xpath("//div[@class='dropdown-active-item product-category-active']")).click();
//	 
	

