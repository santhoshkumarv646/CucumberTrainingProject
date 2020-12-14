package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class NameLocator extends DriverSetup
{
	 static String fName;  
	static WebDriver driver;  
	
	public NameLocator(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	}
	public WebDriver setupDriver()
	{
	    /*Invoke the getWebDriver method from the DriverSetup File*/
	    getWebDriver();
	    return driver;
	    
	}
	public String getNameLocator()
	{
       /*Identify the Firstname
	     Get the placeholder value
	     
         Store the placeholder value in the static variable fName.*/
		driver.getCurrentUrl();
		 fName = driver.findElement(By.xpath("//td[text()='Siva']")).getText();
         
         return fName;
	}
	
	public static void main(String[] args)
	{
	    NameLocator launch = new NameLocator(driver);
	    launch.setupDriver();
	    launch.getNameLocator();
	
	    System.out.println(fName);
	}

}
