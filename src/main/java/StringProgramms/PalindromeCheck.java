package StringProgramms;

public class PalindromeCheck {
	
	static void checkPalindrome(String input)
	{
		//input=MADAM
		String reversed="";
		char[] chars=input.toCharArray();
		
		for(int i=chars.length-1;i>=0;i--)
		{
			reversed+=chars[i];
		}
		System.out.println(reversed.toString().toLowerCase());
		if(reversed.toString().equalsIgnoreCase(input))
		{
			System.out.println("Given word is palindrome");
		}
		else
		{
			System.out.println("Not a palindrome Number");
		}
	}

	public static void main(String[] args) {
		checkPalindrome("AASSAASs");

	}

}
