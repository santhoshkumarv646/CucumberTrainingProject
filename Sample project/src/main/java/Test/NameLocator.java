package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;

public class NameLocator extends DriverSetup
{
		static String fName;  
		static WebDriver driver;
		
	
		public WebDriver setupDriver(WebDriver driver)
		{
		    /*Invoke the getWebDriver method from the DriverSetup File*/
		    getWebDriver();
		    return driver;
		}
		public static String getNameLocator(WebDriver driver)
		{
	       /*Identify the Firstname
		     Get the placeholder value
	         Store the placeholder value in the static variable fName.*/
	            WebElement search = driver.findElement(By.name("fname"));
	            fName = search.getAttribute("placeholder");
			    return fName;
		}
		
		public static void main(String[] args)
		{
		    NameLocator launch = new NameLocator();
		    launch.setupDriver(driver);
		    NameLocator namLocator=new NameLocator();
		    String name = namLocator.getNameLocator(driver);
		    System.out.println(name);
		}

	}
