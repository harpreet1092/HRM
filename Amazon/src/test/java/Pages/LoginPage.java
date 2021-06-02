package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseFile;

public class LoginPage extends BaseFile {
	
	
	
	Actions act;
	
	public LoginPage()
	
	{
		//driver=this.driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#nav-link-accountList")
    WebElement signInOptions;
	
	@FindBy(xpath="//*[@id=\"nav-flyout-ya-signin\"]/a/span")
	WebElement signIn;
	
	@FindBy(css="#ap_email")
	WebElement uname;
	
	@FindBy(css="[type='submit']")
	WebElement cont;
	
	@FindBy(css="#ap_password")
	WebElement pwd;
	
	@FindBy(css="#signInSubmit")
	WebElement submit;
	
	public void validLogin()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		act=new Actions(driver);
		act.moveToElement(signInOptions).build().perform();
		signIn.click();
		uname.sendKeys(prop.getProperty("user"));
		cont.click();
		pwd.sendKeys(prop.getProperty("password"));
		submit.click();
		
	}
	
	
	
	
	
	

}
