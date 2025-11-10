package StringProgramms;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
	
	static void duplicatesElements(String input) {
		
		char[] elements=input.toCharArray(); //Ex: s,u,d,h,e,e,r
		
		Map<Character, Integer> charcount = new HashMap<>();
		
		//Iterate through each character
		
		for(char ch:elements)
		{
			if(charcount.containsKey(ch))
			{
				charcount.put(ch, charcount.get(ch)+1);
			}
			
		}
		
	}

	public static void main(String[] args) {
		
		duplicatesElements("Sudheer");

	}

}
