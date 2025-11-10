package practiceprogramms;

import java.util.LinkedHashMap;
import java.util.Map;

public class CountWordsInString {
	
	static void CountWordsInTheString(String input)
	{
		//input = java is Java
		String[] words=input.toLowerCase().split(" "); //words[0]="java
		
		Map<String, Integer> charCountstrings=new LinkedHashMap<>();
		
		for(String word:words)
		{
			if(charCountstrings.containsKey(word))
			{
				charCountstrings.put(word, charCountstrings.get(word)+1);
			}
			else
			{
				charCountstrings.put(word,1);
			}	
		}
		for(Map.Entry<String, Integer> entry:charCountstrings.entrySet()) {
			
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+" ->"+ entry.getValue());
			}
			

		}
		
	}

	public static void main(String[] args) {
		
		CountWordsInTheString("java is Java PyThon is PyThon IS pythoN");


	}

}
