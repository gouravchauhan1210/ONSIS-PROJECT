package com.base;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest {
	
	public static WebDriver driver;
	public static Properties prop;
	
//	public  void launch() throws MalformedURLException {
//	DesiredCapabilities capabilities = new DesiredCapabilities();
//	capabilities.setCapability("deviceName", "ZY223M5F9M");
//	capabilities.setCapability("platformName", "Android");
//	capabilities.setCapability("appPackage", "abluec.seeker");
//	capabilities.setCapability("appActivity", "abluec.seeker.Splash");	
//	abdroiddriver = new RemoteWebDriver(new URL("http://172.16.10.14:8092/wd/hub"), capabilities);
//	driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//	System.out.println("App Launched Successfully");
//	}
	
	
	public void launchFirefox() {
		System.setProperty("webdriver.gecko.driver", "E:\\Study material\\geckodriver-v0.20.0-win64\\geckodriver.exe");
		new FirefoxDriver();
		driver.get("http://35.177.20.203");
		//delayOrCancelledTrains();		
		
		}
	
//	public BaseTest() {
//		try {
//			prop = new Properties();
//			File src = new File("./config/config.properties");
//			FileInputStream fis = new FileInputStream(src);
//			prop.load(fis);
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
////			} 
//	}
}
 