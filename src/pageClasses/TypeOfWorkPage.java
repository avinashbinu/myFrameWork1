package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TypeOfWorkPage {
	WebDriver driver;
	public TypeOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="ext-gen7")
	private WebElement createTypeofWorkButton;
	
	@FindBy(id="logoutLink")
	private WebElement logOutLink;
	
	public void clickcreateTypeofWorkButton()
	{
		createTypeofWorkButton.click();
	}
	
	public void logoutOfApp()
	{
		logOutLink.click();
	}
}
