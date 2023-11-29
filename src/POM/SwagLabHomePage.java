package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage
{
	@FindBy(xpath ="")private WebElement menu;
	WebDriver driver;
	
	public SwagLabHomePage(WebDriver driver)
	{
		this.driver=driver;
		//global variable = local variable -> assign local driver info to local driver
		PageFactory.initElements(driver, this);
	}
	
	public void verifyTitle()
	{
		String actTitle = driver.getTitle();
		String expTitle = "Swag Labs";
		if (actTitle.equals(expTitle))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
	}
		
	public void ClickOnMenuBtn()
	{
		menu.click();
		
	}

}
