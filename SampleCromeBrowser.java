package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SampleCromeBrowser {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\chrome Driver\\chromedriver-win32-v133\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/select.xhtml");
		driver.manage().window().maximize();
		
		WebElement options=driver.findElement(By.className("ui-selectonemenu"));
		
		Select select=new Select(options);
		
		select.selectByIndex(1); //Selenium
		select.selectByVisibleText("Puppeteer");
		
		//select by sendkeys:
		
		options.sendKeys("Playwright");
		//driver.quit();
	}
	

}
