package StringProgramms;

public class ReverseStringUsingBuilder {

	public static void main(String[] args) {
		
		String input ="Welcome to Java";
		String reversestring="";
		
		String[] words=input.split(" ");
		
		for(String word:words)
		{
			StringBuilder sb = new StringBuilder(word);
			String revsersed=sb.reverse().toString()+" ";
			
			reversestring+=revsersed;
			
		}
		System.out.println(reversestring);

	}

}
