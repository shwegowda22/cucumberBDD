package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class logInpage {
	
	protected WebDriver driver;
	
	private By txt_username = By.xpath("//input[@id='name']");
	private By txt_password= By.xpath("//input[@id='password']");
	private By btn_login= By.xpath("//button[@id='login']");
	private By btn_logout = By.xpath("//*[@id=\"logout\"]");
	
	public logInpage(WebDriver driver)
	
	{
		this.driver= driver;
		if(!driver.getTitle().equals("TestProject Demo"))
			{
			throw new IllegalStateException("This is not login page .The current page is:"+driver.getCurrentUrl());
			}	
	}
	
	public void enterUsername(String username)
	{
		driver.findElement(txt_username).sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		driver.findElement(txt_password).sendKeys(password);
	}
	
	public void loginbutton() {
		driver.findElement(btn_login).click();
	}
	
	public void logoutbutton() {
		driver.findElement(btn_logout).click();
	}

	public void validloginuser(String username, String password)
	{
		driver.findElement(txt_username).sendKeys(username);
		driver.findElement(txt_password).sendKeys(password);
		driver.findElement(btn_login).click();
		
	}
}
