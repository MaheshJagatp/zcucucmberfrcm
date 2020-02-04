package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;

public class HomePage extends TestBase {

	
	@FindBy(xpath="//span[contains(text(),'mahesh jagtap')]")
	WebElement usernamelabel;
	
	@FindBy(xpath="//span[contains(text(),'Contacts')]")
	WebElement Contactslink;
	
	@FindBy(xpath=" //span[contains(text(),'Deals')]")
	WebElement Dealslink;

	@FindBy(xpath=" //span[contains(text(),'Tasks')]")
	WebElement Taskslink;
	
	public  HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
		
	}
	public Boolean verifyUserLabel() {
		return usernamelabel.isDisplayed();
	}
	
	
	public ContactPage clickOnContactPageLink() {
		Contactslink.click();
		return new ContactPage();
	}
	
	
	
	
}
