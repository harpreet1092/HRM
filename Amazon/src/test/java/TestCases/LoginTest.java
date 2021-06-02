package TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Pages.LoginPage;
import TestBase.BaseFile;

public class LoginTest extends BaseFile {
	
	LoginPage lp;
	String expectedUrl;
	String currentUrl;
	
	@BeforeSuite
	public void launchBrowser()
	{
		initializeBrowser();
		lp=new LoginPage();
	}
	
	@Test
	public void validSignIn()
	{
		lp.validLogin();
		expectedUrl="https://www.amazon.in/ap/signin";
		currentUrl=driver.getCurrentUrl();
		Assert.assertEquals(currentUrl, expectedUrl);
	
		
	}
	
	

}
