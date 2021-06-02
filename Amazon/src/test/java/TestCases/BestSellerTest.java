package TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.AllTabPage;
import Pages.BestSellerPage;
import Pages.LoginPage;
import TestBase.BaseFile;

public class BestSellerTest extends BaseFile{
	
	@Test(priority=1)
	public void openSellerPage()
	{
		AllTabPage allTab=new AllTabPage();
		allTab.allTabAccess();
		allTab.sellerPage();
	}
	
	@Test(priority=2)
	public void link()
	{
		BestSellerPage bsPage=new BestSellerPage();
		bsPage.countLinks();
	}

}
