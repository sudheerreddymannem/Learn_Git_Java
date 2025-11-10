package StringProgramms;

public class ReverseAStringWordByWord {
	
	public void reverseWordByWord(String input)
	{
		
		//Split words and Store in String array
		String[] words=input.split(" ");
		
		String reversed="";
		
		for(String word:words)   //Mannem
		{
			String reverseword="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseword+=word.charAt(i); 
			}
			reversed+=reverseword+" ";
		}
		System.out.println("reversed String is :"+reversed);
		
	}

	public static void main(String[] args) {
		ReverseAStringWordByWord reverse = new ReverseAStringWordByWord();
		reverse.reverseWordByWord("Mannem Sudheer Reddy");

	}

}
