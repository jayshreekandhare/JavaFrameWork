package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage
{
	//step1; declaration
	
	@FindBy(xpath="//input[@id='user-name']") private WebElement UN;
	@FindBy(xpath="//input[@id='password']") private WebElement PWD;
	@FindBy(xpath="//input[@id='login-button']") private WebElement login;
	
	//step2; initialization
	
	public SwagLabLoginPage (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		//classname.methodname("WebDriverObject", this)
	}
	
	public void enterUN()
	{
		UN.sendKeys("standard_user");
	}
	public void enterPWD() 
	{
		PWD.sendKeys("secret_sauce");
	}
	public void clickOnLogin() 
	{
		login.click();
	}

	
}
