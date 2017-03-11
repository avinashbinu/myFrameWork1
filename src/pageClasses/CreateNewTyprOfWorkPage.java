package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewTyprOfWorkPage {
	WebDriver driver;
	public CreateNewTyprOfWorkPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="name")
	private WebElement nameTextBox;
	
	@FindBy(xpath="//input[@value='   Create Type of Work   ']")
	private WebElement createTypeofWorkButton;
	
	public void creatingNewWork()
	{
		nameTextBox.sendKeys("Testing17");
		createTypeofWorkButton.click();
	}
}
