package practicejavaprogramms;

public class ReverseWord {
	
	static void reverseAWord(String input)
	{
		
		String reversed="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			reversed+=input.charAt(i);
		}
		System.out.println(reversed.toLowerCase());
		
		
	}

	public static void main(String[] args) {
		
		reverseAWord("suSSSdheer");

	}

}
