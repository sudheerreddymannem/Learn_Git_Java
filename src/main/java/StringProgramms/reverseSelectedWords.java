package StringProgramms;

public class reverseSelectedWords {
	
	//Step-1: take input String , take words that needs to be reversed = String array
	//Step-2: Split every Word using Split method
	//use StringBuffer to reverse
	//use boolean flag to check match found or not
	//check if the Word is in reverse list or not
	//if match found reverse if not keep as it is
	//Add to Final String
	
	public void wordsreversedynamic(String input,String[] wordstobereversed)
	{
		
		String[] words=input.split(" "); //0=Mannem
		StringBuilder result = new StringBuilder();
		
		//loop through each word
		for(String word:words)   //Mannem Sudheer
		{
			boolean tobereversed=false; //be default all values are false
			
		//check if the Word is in reverse list or not
			
			for(String target:wordstobereversed)
			{
				if(word.equalsIgnoreCase(target))
				{
				tobereversed=true;
				break;
				}
			}	
			
			if(tobereversed)
			{
				String reverse = new StringBuilder(word).reverse().toString();
				//String reverse=result.reverse().toString();
				
				result.append(reverse).append(" ");	
			}
			else
			{
				result.append(word).append(" ");
			}
			
			//Add to Final String and print
			
		}
		System.out.println(result.toString().trim());
		
	}

	public static void main(String[] args) {
		
		reverseSelectedWords revrseselecetd = new reverseSelectedWords();
		
		String input = "Java and Python are Programming lanuages";
		
		String[] wordstobereversed = {"Java","lanuages","python"};
		
		revrseselecetd.wordsreversedynamic(input, wordstobereversed);



	}

}
