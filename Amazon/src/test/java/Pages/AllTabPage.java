package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseFile;

   public class AllTabPage extends BaseFile {
	   
	   
	
	public AllTabPage()
	{
		//driver=this.driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//*[@id=\"nav-hamburger-menu\"]/span")
	WebElement allTab;
	
	@FindBy(linkText="Best Sellers")
	WebElement seller;
	
	
	
	
	
	public void allTabAccess()
	{  
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
		allTab.click();
	}
	
	public void sellerPage()
	{
		seller.click();
	}
	
}
