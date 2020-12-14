package Test;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArmstrongNumber {

	public static void main(String[] args) {
       
		int c=0;
		int temp,a;
		int n=153;
		
		temp=n;
		
		while(n>0)
		{
       a=n%10;
       n=n/10; 
	   c=c+a*a*a; 	
		}	
if(c==temp)
{
System.out.println("Armstrong Number");	
}
else
{
	System.out.println("Not ArmstrongNumber");
}
	}
}
