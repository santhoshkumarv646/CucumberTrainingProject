package Test;

import java.util.HashMap;
import java.util.Map;

public class OccurenceofString {

	public static void main(String[] args) {
		
	String str="santhosh";
	Map<Character,Integer> map = new HashMap<>();
	
		for(Character c:str.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c, map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
	
	System.out.println(map);
}
}
