package practiceprogramms;

public class StringBetweenStrings {
	
	static void betweenStrings(String input,String start, String end)
	{
		//Mannem Sudheer Reddy
		
		int startIndex=input.indexOf(start); //0
		int endIndex=input.indexOf(end); //15
		
		if(startIndex!=-1 && endIndex!=-1 && startIndex<endIndex)
		{
			String middle=input.substring(startIndex+start.length(), endIndex);
			System.out.println(middle.trim());
		}
	}

	public static void main(String[] args) {
		
		betweenStrings("Mannem Sudheer Reddy bhai","Mannem", "bhai");

	}

}
