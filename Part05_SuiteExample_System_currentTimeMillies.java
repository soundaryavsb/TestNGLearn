package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Part05_SuiteExample_System_currentTimeMillies {

	WebDriver driver;
	long StartTime;
	@BeforeSuite
	public void OpenChrome() {
		StartTime=System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v134\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void OpenGoogle()
	{
		driver.get("https://www.google.co.in/");
	}

	@Test
	public void OpenBing()
	{
		driver.get("https://www.bing.com/");
	}

	@Test
	public void OpenYahoo()
	{
		driver.get("https://in.search.yahoo.com/");
	}

	@AfterSuite
	public void EndChrome() {
		driver.quit();
		long EndTime=System.currentTimeMillis();
		long TotalTime=StartTime-EndTime;
		System.out.println("Total Time: "+TotalTime);
	}
}
