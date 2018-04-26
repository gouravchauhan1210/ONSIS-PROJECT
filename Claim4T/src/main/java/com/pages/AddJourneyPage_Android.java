package com.pages;

import org.openqa.selenium.By;

public class AddJourneyPage_Android {

	By stationFrom = By.id("FromStationText ");
	By stationFromSearch = By.id("common_search");
	By stationFromDropList = By.xpath("//*[@index='0'");
	
	By startHour = By.id("from_hr");
	By startHourDropList = By.xpath("//*[@index='6']");
	
	By startMinute = By.id("from_min");
	By startMinuteDropList =By.xpath("//*[@index='0']");
	
	By stationTo = By.id("searchfirstToStation");
	By stationToSearch = By.id("common_search");
	By stationToDropList = By.xpath("//*[@index='0']");
	
	By viaStation = By.id("viaStationSpinner");
	
	By returnCheckBox = By.id("returnCheck");
	
	By returnHour = By.id("returnHr");
	By returnHourDroplist = By.xpath("//*[@index='6']");
	
	By returnMinute = By.id("returnMin");
	By returnMinuteDroplist = By.xpath("//*[@index='0']");
	
	By eligibleClaim = By.id("checkTrack");
	By frequencyDaily = By.id("daily");
	By frequencyWeekly = By.id("weekly");
	
	By wakeMeUp = By.id("waketrack");
	
	By wakeMeUpAlarm = By.id("time_spin");
	By wakeMeUpAlarmDropline = By.xpath("//*[text()='2 Mins']");
	
	
	By saveBtn = By.id("save");
}




//By returnMinuteDroplist = By.class("");
//By returnMinuteDroplist = By.xpath("//<>className");
//By returnMinuteDroplist = By.xpath("//*[text()='']");
//By returnMinuteDroplist = By.xpath("//*[@id='' and @class='' and @index='']")
//		By returnMinuteDroplist = By.xpath("//*[@class='']");
//


//*[text()='']
//*[@class='']
//<classname>

