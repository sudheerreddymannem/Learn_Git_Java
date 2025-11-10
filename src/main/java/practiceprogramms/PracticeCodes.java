package practiceprogramms;

public class PracticeCodes {

	public void reverseusingbuffer(String input) {
		
		String reversed="";
		
		input=input.replaceAll(" ", "");
		
		for(int i=input.length()-1;i>=0;i--)
		{
			reversed+=input.charAt(i);
		}
		System.out.println("Reversed String is :"+reversed);
		
		
	}

	public static void main(String[] args) {
		
		PracticeCodes reverseString = new PracticeCodes();
		
		reverseString.reverseusingbuffer("Mannem Sudheer Reddy");

	}

}
