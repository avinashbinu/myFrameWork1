package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageClasses.CreateNewTyprOfWorkPage;
import pageClasses.EnterTimeTrackPage;
import pageClasses.LoginPage;
import pageClasses.TypeOfWorkPage;

public class MyTestCases1 {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApp()
	{
		driver=new FirefoxDriver();
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void closeApp()
	{
		driver.close();
	}
	
	@Test
	public void TC1()
	{
		LoginPage lp=new LoginPage(driver);
		lp.login("admin", "manager");
		EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
		ettp.logoutFrmApp();
	}
	
	@Test
	public void TC2() throws InterruptedException
	{
		LoginPage lp=new LoginPage(driver);
		lp.login("admin","manager");
		Thread.sleep(2000);
		EnterTimeTrackPage ettp=new EnterTimeTrackPage(driver);
		ettp.clickOnSettingIcon();
		Thread.sleep(2000);
		ettp.clickOnTypeOfWorkLink();
		TypeOfWorkPage tow=new TypeOfWorkPage(driver);
		tow.clickcreateTypeofWorkButton();
		CreateNewTyprOfWorkPage cntow=new CreateNewTyprOfWorkPage(driver);
		cntow.creatingNewWork();
		tow.logoutOfApp();
	}

}
