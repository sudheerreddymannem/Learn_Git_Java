package practiceprogramms;

public class reverseWordsSelected {
	
	public void reversewordsselect(String input, String[] wordstobereversed)
	{
		//Sudheer Reddy Mannem
		
		String[] words=input.split(" ");
		StringBuilder result = new StringBuilder();
		
		for(String word: words)
		{
			boolean tobeReversed=false;
			
			for(String target:wordstobereversed)
			{
				if(target.equalsIgnoreCase(word))
				{
					tobeReversed=true;
				}
			}
			if(tobeReversed)
			{
				String reversed=new StringBuilder(word).reverse().toString();
				result.append(reversed).append(" ").toString().trim();
			}
			else
			{
				result.append(word).append(" ").toString().trim();
			}
			
		}
		System.out.println(result);
		
		
		
		
		
	}
	

	public static void main(String[] args) {
		
		reverseWordsSelected reversedwords = new reverseWordsSelected();
		
		String input="Sudheer Reddy Mannem Bhanu TATA";
		String[] wordstobereversed= {"Mannem", "tata","Reddy"};
		reversedwords.reversewordsselect(input, wordstobereversed);

	}

}
