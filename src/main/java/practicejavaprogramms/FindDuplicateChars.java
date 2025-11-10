package practicejavaprogramms;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindDuplicateChars {
	
	static void duplicateChars(String input)
	{
		//s,u,d,h,e,e,r
		
		char[] chars=input.toCharArray();
		
		Map<Character,Integer> charCountMap =new LinkedHashMap<>();
		
		for(char ch:chars)
		{
			if(charCountMap.containsKey(ch))
			{
				charCountMap.put(ch,charCountMap.get(ch)+1);
			}
			else
			{
				charCountMap.put(ch,1);
			}
			
		}
		
		for(Map.Entry<Character, Integer> entry:charCountMap.entrySet())
		{
			if(entry.getValue()>1)
			{
			System.out.println(entry.getKey() + "-> "+entry.getValue());
			}
		}
		
		
	}

	public static void main(String[] args) {


		duplicateChars("Sudheer");

	}

}
