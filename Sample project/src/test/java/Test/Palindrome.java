package Test;

public class Palindrome {

	public static void main(String[] args) {
	String str= "Malayalam";
	String rev="";
	for(int i=str.length()-1;i>=0;i--)
	{
	   rev=rev+str.charAt(i);
	}
       if(str.equalsIgnoreCase(rev))
       {
    	  System.out.println("Palindrome");
       }
       else
       {
    	   System.out.println("Not Palindrome");
       }
	}
}
