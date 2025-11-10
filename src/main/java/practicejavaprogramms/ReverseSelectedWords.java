package practicejavaprogramms;

public class ReverseSelectedWords {
	
	static void reverseSelectedWords(String input, String[] SelectedWord)
	{
		StringBuilder result = new StringBuilder();
		
		String[] words=input.split(" ");
		
		for(String word:words)
		{
			boolean tobereversed=false;
			
			for(String target:SelectedWord)
			{
				if(target.equalsIgnoreCase(word))
				{
					tobereversed=true;
					break;
				}
			}
			
			if(tobereversed)
			{
				String reverse=new StringBuilder(word).reverse().toString();
				result.append(reverse).append(" ");
			}
			else
			{
				result.append(word).append(" ");
			}
		}
		System.out.println(result.toString().trim());
		
	}

	public static void main(String[] args) {
		
		String[] SelectedWord= {"Java","along","Python"};
		
		String input="Java is a Programming Language along with the python";
		
		reverseSelectedWords(input,SelectedWord);


	}

}
