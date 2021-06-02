package Pages;



import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseFile;

public class BestSellerPage extends BaseFile {
	
	public BestSellerPage()
	{
	
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	public  void countLinks()
	{
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		List<WebElement> allLinks=driver.findElements(By.tagName("a"));
		 int totalLinks=allLinks.size();
		System.out.println(totalLinks);
	
	}
	

}
