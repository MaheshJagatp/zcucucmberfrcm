package com.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import com.qa.util.TestBase;

public class loginPage  extends TestBase{
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")
	WebElement LogIn;
	
	@FindBy(xpath="//*[@name='email']")
	WebElement email;

	@FindBy(xpath="//*[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//div[contains(text(),'Login')]")
	WebElement logButton;
	
	@FindBy(xpath="//a[contains(text(),\"Sign Up\")]")
	WebElement Signup;
	
	public  loginPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	public String validateLoginTitle() {
		return driver.getTitle();
	}
	
	
	public HomePage login(String un,String pwd) {
		LogIn.click();
		email.sendKeys(un);
		password.sendKeys(pwd);
		logButton.click();
		
		return new HomePage();
	}
	
	

}
