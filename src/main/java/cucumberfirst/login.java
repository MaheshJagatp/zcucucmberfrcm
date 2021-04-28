package cucumberfirst;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

      
public class login {
    	 WebDriver driver ;
    	 
    	 
	@Given("^User is already on home page$")
	public void user_is_already_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freecrm.co.in");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
		
	    
	}

	@When("^user enters username$")
	public void user_enters_username()  {
	   driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys("jagtapmahesh01@gmail.com");
	  
	}

	@Then("^user enters password$")
	public void user_enters_password()  {
	 
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys("JAGTAPmahesh@01");
	}

	@Then("^click on signin$")
	public void click_on_signin()  {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
	   
	}

	@And("^user is on homepage$")
	public void user_is_on_homepage() {
		String abc=driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[3]/span[1]")).getText();
	   
		System.out.println(abc);
		driver.close();
	}
/* Second scenario*/

	@Given("^User  on home page$")
	public void user_on_home_page()  {
	   
	}

	@When("^user  username$")
	public void user_username() {
	    Assert.fail();
	}

	@Then("^user  password$")
	public void user_password() {
	    
	}

	@Then("^user  on homepage$")
	public void user_on_homepage()  {
	   
	}


	
	/**/

	@Given("^User  on home$")
	public void user_on_home1()  {
	    Assert.fail();
	}

	@When("^user  user$")
	public void user_user()  {
	   
	}

	@Then("^user  pass$")
	public void user_pass()  {
	
	}

	@Then("^user  on home$")
	public void user_on_home()  {
	    
	}
}
