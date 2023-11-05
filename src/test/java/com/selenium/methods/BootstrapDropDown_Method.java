package com.selenium.methods;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BootstrapDropDown_Method {

	static WebDriver driver;
	
	public static void main(String[] args) throws AWTException, Exception {
		
		driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.hdfc.com/");
		
		//Popups for Firefox
		Thread.sleep(7000);
		driver.findElement(By.xpath("//button[text()='Later']")).click();
		
		//To fix the Browser size, because I could not click on the Drop-Down becuse of popups.
		//System.out.println("zooming");			
			Robot robot = new Robot();		
			Thread.sleep(7000);
			System.out.println("About to zoom out");
			for (int i = 0; i < 3; i++) {
				robot.keyPress(KeyEvent.VK_CONTROL);
				robot.keyPress(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_SUBTRACT);
				robot.keyRelease(KeyEvent.VK_CONTROL);
			}
			
			Thread.sleep(7000);
			//Clicking on First Drop Down Box
			driver.findElement(By.xpath("//div[@class='dropdown-active-item product-category-active']")).click();
			List<WebElement> allEle=driver.findElements(By.xpath("//ul[@class='product-tab-list product-category-list dropdown-active']/li"));
			selectDropDown(allEle, "Refinance");			
			
			//Clicking on Second DropDown Box
			driver.findElement(By.xpath("//div[@class='dropdown-active-item product-name-active']")).click();
			Thread.sleep(7000);
			List<WebElement> allElement=driver.findElements(By.xpath("//ul[@class='product-tab-list product-name-list dropdown-active']/li"));
			selectDropDown(allElement, "Plot Loans");	
	}
	
	
	
	
	
	
	
	
	//Method
	public static void selectDropDown(List<WebElement> allOption, String value ) {
		for(WebElement option: allOption) {
			if(option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	
	}
}
