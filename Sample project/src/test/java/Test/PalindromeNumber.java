package Test;

import java.util.HashSet;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PalindromeNumber {

	public static void main(String[] args) {
    
		
	int	n=454,a;
	int c=0;
	int temp;
	
	temp=n;
	
	while(n>0)
	{
		a=n%10;
		c=c*10 + a;
		n=n/10;
	}
	
	if(temp==c)
	{
		System.out.println("Palindrome");
	}
	else
	{
	System.out.println("Not Palindrome");	
	}
	}
}
