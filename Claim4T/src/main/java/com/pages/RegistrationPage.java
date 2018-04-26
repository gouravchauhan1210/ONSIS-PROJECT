package com.pages;

import org.openqa.selenium.By;

public class RegistrationPage {

	By firstName =By.name("first_name");
	By lastName = By.name("surname");
	By email = By.id("email");
	By phone =By.id("mobile");
	By password =By.id("password");
	By confrimPassword = By.id("confirm_pass");
	By profilPic =By.name("customer_profile_pic");
	By address1 = By.name("address1");
	By address2 = By.name("address2");
	By termscondition = By.xpath("//*[@id=\"tandc\"]");
	By registerbtn =By.xpath("//*[@id=\"signup-form\"]/div/div/div[9]/div/div/input");
	
}
