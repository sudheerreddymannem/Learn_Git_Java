package StringProgramms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountStrings {
	
	//java is java python is python -> 
	static void countStringsOccurance(String input)
	{
		String[] words=input.split(" ");
		
		Map<String,Integer> countEachStrings= new LinkedHashMap<>();
		
		for(String word:words)
		{
			if(countEachStrings.containsKey(word))
			{
				countEachStrings.put(word, countEachStrings.get(word)+1);
			}
			else
			{
				countEachStrings.put(word, 1);
			}
		}
		
		for(Map.Entry<String, Integer> entry:countEachStrings.entrySet())
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+"-> "+entry.getValue());
			}
		}
		
	}

	public static void main(String[] args) {
		
		CountStrings count=new CountStrings();
		
		 String input="java is java python is python";
		
		countStringsOccurance(input);



	}

}
