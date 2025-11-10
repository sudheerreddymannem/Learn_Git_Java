package StringProgramms;

import java.util.Scanner;

public class ReverseAString {
	
	public void reverseString(String input)
	{
//		System.out.println("Enter the String to be reverse :");
//		Scanner sc = new Scanner(System.in);
//		String input=sc.nextLine();
			
		//input = input.replaceAll(" ", "");
		
		//String input="Sudheer";
		
		String reversed="";
		
		for(int i=input.length()-1;i>=0;i--)
		{
			reversed+=input.charAt(i);
			
		}
		System.out.print("Reversed String is:"+reversed);

	}

	public static void main(String[] args) {
		
		ReverseAString reverse = new ReverseAString();
		reverse.reverseString("Sudheer Reddy Mannem");
		
	}

}
