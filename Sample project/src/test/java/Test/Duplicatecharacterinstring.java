package Test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Duplicatecharacterinstring {

	public static void main(String[] args) 
	{
		
		String str="santhosh";
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for(int i=0;i<str.length();i++)
		{
			set.add(str.charAt(i));
		}
		for(Character c:set)
		{
			sb.append(c);
		}
		System.out.println(sb);
//	 {
//       String str="a e e o u";
//       StringBuilder sb = new StringBuilder();
//       Set<Character> set = new LinkedHashSet();
//	   for(int i=0;i<str.length();i++)
//	   {
//		  set.add(str.charAt(i)) ;
//	   }
//	   for(Character c : set)
//	   {
//		   sb.append(c);
//	   }
//	   
//	   System.out.println(sb);
//	   }
}
}