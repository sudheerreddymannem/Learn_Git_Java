package StringProgramms;

public class findStringBetweenStrings {
	
	public void stringBetweenStrings(String input,String Start,String End)
	{
		
		int startIndex=input.indexOf(Start); //mannem Sudheer Reddy -0
		int endIndex=input.indexOf(End); //15
		
		//cehck the String are valid returns -1//
		if(startIndex!=-1 && endIndex!=-1 && startIndex<endIndex)
		{
			String middle=input.substring(startIndex+Start.length(), endIndex);
			
			System.out.println(middle.trim());
		}
		else
		{
			System.out.println("middle String not found");
		}
	
		
	}

	public static void main(String[] args) {
		
		findStringBetweenStrings betweenStrings=new findStringBetweenStrings();
		
		betweenStrings.stringBetweenStrings("Mannem Sudheer Reddy", "Mannem", "Reddy");



	}

}
