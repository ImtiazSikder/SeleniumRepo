package com.pkg.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebTable2 {

	public static void main(String[] args) {
				
		WebDriver driver;
		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");		

	
		List<WebElement> names=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
		List<WebElement> prices=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	
		for(int i=0; i<names.size(); i++) {
			if(names.get(i).getText().equals("Sobha")) {
				System.out.println(names.get(i).getText()+"----------"+prices.get(i).getText());
			}
		}
		
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		
//		List<WebElement> names=driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td[1]"));
//		List<WebElement> prices=driver.findElements(By.xpath("//table[@class='ws-table-all']/tbody/tr/td[3]"));
//
//		boolean flag=false;
//		for(int i=0; i<names.size(); i++){
//			//if(names.get(i).getText().equals("Island Trading")){
//			System.out.println(names.get(i).getText()+ "-------"+ prices.get(i).getText());
//		}
		


