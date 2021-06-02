package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseFile {
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseFile()
	{
		try {
			FileInputStream fis=new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Amazon\\src\\test\\java\\Configuration\\config.properties");
			prop=new Properties();
			prop.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	public static void initializeBrowser()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
	}
	
	
	public static void terminateBrowser()
	{
		driver.quit();
	}

}
