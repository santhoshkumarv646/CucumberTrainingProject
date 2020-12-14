package testng;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DriverSetup {
	
	 public static WebDriver driver;
	 public static WebDriver getWebDriver() {
	System.setProperty("webdriver.chrome.silentOutput", "true");
	System.setProperty("webdriver.chrome.driver","F:\\Eclipse-workspace\\NewOne\\CucumberTrainingProject\\Sample project\\chromedriver.exe");
	ChromeOptions options = new ChromeOptions();
	options.setPageLoadStrategy(PageLoadStrategy.NONE);
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://webapps.tekstac.com/Shopify/");
	
	return driver;
}
}
