package com.qa.stepDefination;

import com.qa.pages.ContactPage;
import com.qa.pages.HomePage;
import com.qa.pages.loginPage;
import com.qa.util.TestBase;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class HomePageSteps  extends TestBase{
	
	loginPage lp ;
	HomePage hp;
	ContactPage cp;
	
	@Given("^User opens the browser$")
	public void user_opens_the_browser()  {
		
		TestBase.initialization();
	    
	}

	@Then("^The user is on login page$")
	public void the_user_is_on_login_page()  {
		lp= new loginPage();	
	  String title= lp.validateLoginTitle();
	  Assert.assertEquals("Free CRM #1 cloud software for any business large or small",title);
	}

	@Then("^user enters username and password$")
	public void user_enters_username_and_password() {
	   hp=lp.login(prop.getProperty("username"), prop.getProperty("password"));
		
		
	}
	@Then("^user is on homepage$")
	public void user_is_on_homepage()  {
	   String title= hp.verifyHomePageTitle();
		Assert.assertEquals("Cogmento CRM", title);
		
		
		cp=hp.clickOnContactPageLink();
		
	}

	@Then("^user click on contact page$")
	public void user_click_on_contact_page() {
		
	    System.out.println("on contact page");
	}


	
	

}
