package Test;

public class ReverseNumber {

	public static void main(String[] args) {
    int n =1234,digit;
    int c=0;
   
    while(n!=0)
    {
    	digit=n%10;
    	c= c*10 + digit;
    	n=n/10;
    }
		System.out.println(c);
	}

}
