package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageFactory.homePage;
import pageFactory.logInpage_PF;

public class loginDemo_pf {

	WebDriver driver=null;
	logInpage_PF login;
	homePage home;
	@Given("Browser is open")
	public void browser_is_open() {
		System.out.println("I am inside Logindemo_pf file");
		String projectpath= System.getProperty("user.dir");
		System.out.println("project psth is:"+projectpath);
	    System.setProperty("webdriver.chrome.driver",projectpath+"/src/test/resources/Drivers/chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    driver.manage().window().maximize();
	}

	@And ("user is on login page")
	public void user_is_on_login_page() {
		
		driver.navigate().to("https://example.testproject.io/web/");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username, String password) throws InterruptedException {
		login = new logInpage_PF(driver);
		 home = new homePage(driver);
		login.enterUsername(username);
		login.enterPassword(password);
	    Thread.sleep(5000);
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
		
		login.loginbutton();
		
	}
	
	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		driver.findElement(By.id("logout")).isEnabled();
		//home.logoutbutton();
		Thread.sleep(5000);
	 driver.close();
	}
}
