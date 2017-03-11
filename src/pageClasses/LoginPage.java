package pageClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(name="username")
	private WebElement usrnm;
	
	@FindBy(name="pwd")
	private WebElement passwrd;
	
	@FindBy(id="loginButton")
	private WebElement loginBtn;
	
	public void login(String un,String pwd)
	{
		usrnm.sendKeys(un);
		passwrd.sendKeys(pwd);
		loginBtn.click();
	}
}
