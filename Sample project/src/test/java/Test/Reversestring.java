package Test;

public class Reversestring {
	public static void main(String[] args) 
	{
	
	String str ="MALAYALAM";
	StringBuilder sb = new StringBuilder();
	char[] ch = str.toCharArray();
	for(int i=ch.length-1;i>=0;i--)
	{
		sb.append(ch[i]);
	}
	String ActualValue=sb.toString();
	if(ActualValue.equalsIgnoreCase(str))
	{
	System.out.println("Given String is Palindrome");
	}
	else
	{
		System.out.println("Given String is Palindrome");
	}
}
}
