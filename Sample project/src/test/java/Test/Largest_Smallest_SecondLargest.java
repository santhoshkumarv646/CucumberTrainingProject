package Test;

public class Largest_Smallest_SecondLargest {
	
	
	 public static int getLargestNumber(int a[],int Total) 
	    {
	    	
	    	int temp;
	    	for(int i=0;i<Total;i++)
	    	{
	    		for(int j=i+1;j<Total;j++)
	    		{
	    			if(a[i]>a[j])
	    			{
	    				temp=a[i];
	    				a[i]=a[j];
	    				a[j]=temp;
	    			}
	    		}
	    	}
	    	return a[Total-5];
	    }

		public static void main(String[] args) {
	       
			
			int[] a= {1,4,5,3,8};
			System.out.println(getLargestNumber(a,5));
			
			
		}

}
