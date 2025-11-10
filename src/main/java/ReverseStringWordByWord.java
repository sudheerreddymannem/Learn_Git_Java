
public class ReverseStringWordByWord {
	
	//Mannem Sudheer Reddy
	
	static void reverseWordByWord(String input)
	{
		String[] words=input.split(" "); //Mannem
		
		String reversed="";
		
		for(String word: words)
		{
			String reverseword="";
			for(int i=word.length()-1;i>=0;i--)
			{
				reverseword+=word.charAt(i);
			}
			//System.out.println(reverseword);
			reversed+=reverseword+" ";
		}
		System.out.println("reversed String is :"+reversed);
		
	}

	public static void main(String[] args) {
		
		reverseWordByWord("Mannem Sudheer Reddy");

	}

}
