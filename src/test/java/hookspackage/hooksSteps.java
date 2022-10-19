package hookspackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class hooksSteps {
	
	WebDriver driver;
	
	@Before
	public void browsersetup()
	{
		System.out.println("I am inside browser setup");
		String projectpath= System.getProperty("user.dir");
		System.out.println("project psth is:"+projectpath);
	    System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	}
	
	@Before
	public void setup()
	{
		System.out.println("I am inside second setup");
	}
	@After(order=1)
	public void teardown()
	{
		System.out.println("I am inside teardown");
		driver.close();
		driver.quit();
	}
	
	@After(order=2)
	public void teardown2()
	{
		System.out.println("I am inside teardown 2");
	}
	@BeforeStep
	public static void beforesteps()
	{
		System.out.println("I am before steps");	
	}
	
	@AfterStep
	public static void aftersteps()
	{
		System.out.println("I am after steps");	
	}
	
	@Given
	("user is on login page")
	public void user_is_on_login_page() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@When("user enters username and password")
	public void user_enters_username_and_password() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@And("clicks on login button")
	public void clicks_on_login_button() {
	    // Write code here that turns the phrase above into concrete actions
	}
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	}


}
