package Test;

import java.util.Scanner;

public class NameSplitting {

	public static void main(String[] args) {
    int[] a = {1,2,3,4,5,5};
    
    for(int i=0;i<a.length-1;i++)
    {
    	for(int j=i+1;j<a.length;j++)
    	{
    		if(a[i]==a[j]&&(i!=j))
    		{
    			System.out.println("The duplicate of given array is"+" "+a[j]);
    		}
    	}
    }
		
	}

		
}
