package practicejavaprogramms;

public class ReverseString {
	
	static void reverseAString(String input)
	{
		String reversed="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			reversed+=input.charAt(i);
		}
		System.out.println(reversed.replaceAll(" ", ""));
		System.out.println(reversed);
		
	}
	
	
public static void main(String[] args) {
		
	reverseAString("Mannem Sudheer Reddy");

	}

}
