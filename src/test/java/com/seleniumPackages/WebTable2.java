package com.seleniumPackages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver;
		driver=new FirefoxDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		//*[@id="customers"]/tbody/tr[2]/td[1]
		//*[@id="customers"]/tbody/tr[2]/td[1]
		
		
		List<WebElement> names=driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td[1]"));
		List<WebElement> prices=driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td[3]"));
		//table[@class='ws-table-all']/tbody/tr/td[3]
		
//		String beforeXPath="//*[@id=\"customers\"]/tbody/tr[";
//		String afterXPath="]/td[1]";
		
		boolean flag=false;
		for(int i=0; i<names.size(); i++){
			//if(names.get(i).getText().equals("Island Trading")){
			System.out.println(names.get(i).getText()+ "-------"+ prices.get(i).getText());
			//break;
			//}
		}
		
		//if(fSlag==false) {
		//	System.out.println("Name not found");
		//}

	}
}
