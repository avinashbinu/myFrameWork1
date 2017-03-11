package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage {
	WebDriver driver;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="logoutLink")
	private WebElement logOutLink;
	
	@FindBy(xpath="//div[@class='popup_menu_icon settings_icon']")
	private WebElement settingIcon;
	
	@FindBy(id="popup_menu_item_2")
	private WebElement TypeOfWorkLink;
	
	public void logoutFrmApp()
	{
		logOutLink.click();
	}
	
	public void clickOnSettingIcon()
	{
		settingIcon.click();
	}
	
	public void clickOnTypeOfWorkLink()
	{
		TypeOfWorkLink.click();
	}

}
