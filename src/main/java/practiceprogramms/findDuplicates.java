package practiceprogramms;

import java.util.LinkedHashMap;
import java.util.Map;

public class findDuplicates {
	
	static void duplicateelements(String input)
	{
		//input= M,a,n,n,e,m
		
		char[] characters=input.toLowerCase().toCharArray(); //{M , a ,}
		
		Map<Character, Integer> charCountMap=new LinkedHashMap<>();
		
		for(char chars:characters)  //chars = M, a, n n, e, m
		{
			if(charCountMap.containsKey(chars))
			{
				charCountMap.put(chars,charCountMap.get(chars)+1);
			}
			else
			{
				charCountMap.put(chars,1);
			}	
			
		}
		for(Map.Entry<Character,Integer> entry:charCountMap.entrySet())
		{
			if(entry.getValue()>1)
				
			{
				System.out.println(entry.getKey() + "->" + entry.getValue());
			}
			
		}
		
		
		
	}

	public static void main(String[] args) {
		
		duplicateelements("MAaNnEEEmmMMs");
	}

}
