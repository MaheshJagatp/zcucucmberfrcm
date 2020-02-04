package DataDriven;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class log12 {
	
	WebDriver driver;
	
	@Before
	public void setUp() {
		System.out.println("Launch the URL");
	}
	
	@After
	public void tearDown() {
		System.out.println("End the test");
		driver.close();
	}
	
	
	@Given("^User is on home page$")
	public void user_is_on_home_page()  {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://freecrm.co.in");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a")).click();
		
	}

	/*@When("^enters \"([^\"]*)\"$")
	public void enters(String uname) {
		   driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).
		   sendKeys(uname);

	}*/

	@When("^enters username$")
	public void enters_username(DataTable credentials)  {
		List<List<String>> lt=credentials.raw();
	   driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[1]/div/input")).sendKeys(lt.get(0).get(0));
	}
	
	
	/*@Then("^enters the \"([^\"]*)\"$")
	public void enters1(String pass)  {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).
		sendKeys(pass);

	}*/
	
	@Then("^enters the password$")
	public void  enters_the_password(DataTable credentials)  {
		List<List<String>> lt=credentials.raw();
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[2]/div/input")).sendKeys(lt.get(0).get(0));
	}

	@Then("^click signin$")
	public void click_signin()  {
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();

	}

	@Then("^user on homepage$")
	public void user_on_homepage()   {
		String abc=driver.findElement(By.xpath("//*[@id=\"top-header-menu\"]/div[3]/span[1]")).getText();
		   
		System.out.println(abc);
	}


	

}
