package Test;

import java.util.HashMap;
import java.util.Map;

public class GetDuplicateValueanditscount {

	public static void main(String[] args) {
		String str = "natarajan";
		Map<Character,Integer> map = new HashMap<>();
		for(Character  c : str.toCharArray())
		{
			if(map.containsKey(c))
			{
				map.put(c,map.get(c)+1);
			}
			else
			{
				map.put(c, 1);
			}
		}
		for(Map.Entry<Character,Integer> duplicate:map.entrySet())
		{
			if(duplicate.getValue()>1)
			{
				System.out.println(duplicate.getKey()+" : "+duplicate.getValue());
			}
		}
		}
	}

