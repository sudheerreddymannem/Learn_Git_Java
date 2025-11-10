package practicejavaprogramms;

public class ReverseUsingStringBuilder {
	
	static void rverseStringBuilder(String input)
	{
		String[] words=input.split(" "); //Mannem Sudheer Reddy
		 
		String reversed="";
		
		
		for(String word: words)  //Mannem
		{
			
			StringBuilder sb = new StringBuilder(word);
			String reverseword=sb.reverse().append(" ").toString();
			reversed+=reverseword;
		}
		System.out.println(reversed);
		
	}

	public static void main(String[] args) {
		
		rverseStringBuilder("Mannem Sudheer Reddy");


	}

}
