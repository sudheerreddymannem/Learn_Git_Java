package practiceprogramms;

public class reverseWordByWord {
	
	static void reverseEveryWordbyWord(String input)
	{
		//Mannem Sudheer Redddy
		
		String[] words=input.split(" "); //Mannem
		String reversed="";
		
		for(String word:words)
		{
			String reverseWord="";
			
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseWord+=word.charAt(i);
			}
			reversed+=reverseWord+" ";
			
		}
		System.out.println(reversed);	
		
	}

	public static void main(String[] args) {
		
		reverseEveryWordbyWord("Mannem Sudheer Reddy");

	}

}
