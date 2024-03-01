package demoJenkins;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo {
	@Test
	public void lunchBrowser()
	{
System.setProperty("webdriver.chrome.driver","G:\\chromedriver_win32 (6)\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com");
		
		System.out.println("Page Title:"+driver.getTitle());
	
		System.out.println("Page Title:"+driver.getTitle());
		
		System.out.println("Page currentUrl:"+driver.getCurrentUrl());
		
		System.out.println("Page souece code:"+driver.getPageSource());
		System.out.println("Page souece code:"+driver.getPageSource());
		
		driver.close();
		
	}
}
