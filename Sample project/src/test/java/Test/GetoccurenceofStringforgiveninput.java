package Test;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class GetoccurenceofStringforgiveninput {

		public static void main(String[] args) {
		   String str ="santhosh";
		   String str2="s";
		   int num=0;
		  
		   char[] ch= str.toCharArray();
		   char[] ch2=str2.toCharArray();
		   
		   for(int i=0;i<ch2.length;i++)
		   {
			   for(int j=0;j<ch.length;j++)
			   {
				 if(ch2[i]==ch[j])
				 {
					 num++;
				 }
			   }
		   }
		   
		   System.out.println("for the given"+" "+str2+"is"+" "+num);
		}
	}

