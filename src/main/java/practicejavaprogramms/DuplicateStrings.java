package practicejavaprogramms;

import java.util.HashMap;
import java.util.Map;

public class DuplicateStrings {
	
	static void FindDuplicateStrings(String input)
	{
		String[] words = input.split(" ");
		
		Map<String, Integer> CountStrings=new HashMap<>();
		
		for(String word: words) //java is java
		{
			if(CountStrings.containsKey(word))
			{
				CountStrings.put(word, CountStrings.get(word)+1);
			}
			else
			{
				CountStrings.put(word, 1);
			}
			
		}
		for(Map.Entry<String, Integer>entry:CountStrings.entrySet())
		{
			if(entry.getValue()>1) {
			System.out.println(entry.getKey()+"->"+entry.getValue());
			}
		}
		
		
	}

	public static void main(String[] args) {
		
		FindDuplicateStrings("Java is Java");

		

	}

}
