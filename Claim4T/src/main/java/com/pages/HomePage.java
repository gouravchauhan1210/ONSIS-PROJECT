package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.base.BaseTest;

	public class HomePage extends BaseTest {
		
	@FindBy(xpath ="//a[text()='Login']")
	WebElement home;
//	
//	@FindBy(css ="#last_days]")
//	WebElement selectDays;
//	
//	@FindBy(xpath="//*[@id=\"select2-station_from-container\"]")
//	WebElement stationFrom;
//	
//	@FindBy(xpath="//*[@id=\"select2-station_to-container\"]")
//	WebElement stationTo;
//	
//	@FindBy(xpath="/html/body/span/span/span[1]/input")
//	WebElement stationToSearch;
//	
//	@FindBy(xpath="//*[@id=\"time_period\"]")
//	WebElement timePeriod;
//	
//	@FindBy (xpath="//*[@id=\"start_time_hr\"]")
//	WebElement startTimeHr;
//	
//	@FindBy(xpath="//*[@id=\"start_time_min\"]")
//	WebElement StartTimeMin;
//	
//	@FindBy (xpath="//*[@id=\"end_time_hr\"]")
//	WebElement endTimeHr; 
//	
//	@FindBy (xpath="//*[@id=\"end_time_min\"]")
//	WebElement endTimeMin;
//	
//	@FindBy (xpath="//*[@id=\"main-wrapper\"]/div[2]/div/section[1]/div/div/div[2]/div/form/div[4]/div/input")
//	WebElement submitBtn;
//	
//	@FindBy (xpath="/html/body/span/span/span[1]/input")
//	WebElement stationFromSearch;
	
	public HomePage(){
		PageFactory.initElements(driver, this);
	}
		
		@Test
		public void Firefox() throws InterruptedException{
		System.out.println("driver="+ driver);
			
		 launchFirefox();
		 System.out.println("driver="+ driver);
		 Thread.sleep(20000);
//		 home.click();
	}
//							
//		@Test
//		public void delayOrCancelledTrains(){
//			System.out.println("pass");
//			
//		driver.findElement(By.xpath("")).click();;
//		select day for dropdownlist
//		selectDays.click(); 
//		Thread.sleep(20000);
//		Select s = new Select(selectDays);
//		s.selectByVisibleText(prop.getProperty("PleaseSelectDays"));
//		Thread.sleep(20000);
//		stationFrom.click();
//		System.out.println("click on from station");
//		Thread.sleep(2000);
//		stationFromSearch.sendKeys(prop.getProperty("stationFromSearch"));
//		Thread.sleep(2000);
//		Select sf = new Select(stationFromSearch);
//		Thread.sleep(2000);
//		sf.selectByIndex(1);
//		Thread.sleep(2000);	
//	}
	
}

