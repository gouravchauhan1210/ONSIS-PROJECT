package com.util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.base.BaseTest;

public class Wait extends BaseTest{
	
public void implicitwaitForMinute(WebDriver driver,int time)
	{
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
	}

		public void implicitwaitForSecond(WebDriver driver,int time)
	{
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);	
	}
		
		public void explicitWait(WebDriver driver,int time,WebElement element)
		{
			WebDriverWait wait=new WebDriverWait(driver,time);
			wait.until(ExpectedConditions.visibilityOf(element));
		}
}
	
