package Test;

public class ReversingOnlySpecificString {

	public static void main(String[] args) {
		
		       String str = "ij am santhosh";
		       //StringBuffer sbu = new StringBuffer(str);
		       
		       String split[]=str.split(" ");
		       for(int i=split.length-1;i>=0;i--)
		       {
		    	  if(i==2)
		    	  {
		    	   StringBuffer sbu = new StringBuffer(split[i].toString());
		    	   System.out.print(sbu.reverse()+ " ");
		    	  }
		    	  else
		    	  {
		    		System.out.print(split[i]+ " ");  
		    	  }
			}
		}
}
