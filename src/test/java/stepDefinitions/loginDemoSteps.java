package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginDemoSteps {

	WebDriver driver=null;
	@Given("Browser is open")
	public void browser_is_open() {
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
	    driver.findElement(By.xpath("//input[@id='name']")).sendKeys(username);
	    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(password);
	    Thread.sleep(5000);
	}
	
	@And("clicks on login button")
	public void clicks_on_login_button() {
	 driver.findElement(By.xpath("//button[@id='login']")).click();
	}

	@Then("user is navigated to home page")
	public void user_is_navigated_to_home_page() throws InterruptedException {
		driver.findElement(By.id("logout")).isEnabled();
		Thread.sleep(5000);
	 driver.close();
	}
}
