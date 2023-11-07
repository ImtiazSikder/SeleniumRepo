package com.seleniumPackages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebTable_Demo {
	static WebDriver driver;
	
	
	
	public static void main(String[] args) {

		driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
		
		String company="Island Trading";
		int rowNumber=getRowNumberWithCellData("//table[@class='dataTable']",company,"xpath");
		Assert.assertTrue(rowNumber !=-1, "Company name not in the table - "+company);
		String price=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rowNumber+"]/td[3]")).getText();
		System.out.println(price);
		
		
	}
	
	
	
	public static int getRowNumberWithCellData(String tableLocator, String data, String identifier) {
		List<WebElement> rows=null;
		if(identifier.equals("xpath"))
			rows=driver.findElements(By.xpath(tableLocator+"/tbody/tr"));
		else
			rows=driver.findElements(By.cssSelector(tableLocator+">tbody>tr"));
		
		for(int rNum=0; rNum<rows.size();rNum++) {
			WebElement row=rows.get(rNum);
			List<WebElement> cells=row.findElements(By.tagName("td"));
			for(int cNum=0; cNum<cells.size(); cNum++) {
				if(data.equals(cells.get(cNum).getText()))
					return (rNum+1);
			}
		}
		return -1;
	}
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		driver.get("https://www.w3schools.com/html/html_tables.asp");
//		
//		//*[@id="customers"]/tbody/tr[2]/td[1]
//		//*[@id="customers"]/tbody/tr[3]/td[1]
//		//*[@id="customers"]/tbody/tr[4]/td[1]
//		//*[@id="customers"]/tbody/tr[7]/td[1]
//		
//		List<WebElement> allRows=driver.findElements(By.xpath("//*[@id=\"customers\"]/tbody/tr"));
//		int rowCount=allRows.size();						  
//		System.out.println("Total rows are: " + rowCount);
//		
//		String beforeXPath="//*[@id=\'customers\']/tbody/tr[";
//		String afterXPath="]/td[1]";
//		
//		for(int i=1; i<rowCount; i++) {
//			String actualXPath=beforeXPath + i + afterXPath;
//			WebElement element=driver.findElement(By.xpath(actualXPath));
//			
//			System.out.println(element.getText());
//		}
//		}
	


