package pageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class logInpage_PF {
	
	WebDriver driver=null;
	
	@FindBy(xpath="//input[@id='name']")
	WebElement txt_username ;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement txt_password;
	
	@FindBy(xpath="//button[@id='login']")
	WebElement btn_login;
	
	
public logInpage_PF(WebDriver driver)
	
	{
		this.driver= driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername(String username)
	{
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		txt_password.sendKeys(password);
	}
	
	public void loginbutton() {
		btn_login.click();
	}
	
	
}
