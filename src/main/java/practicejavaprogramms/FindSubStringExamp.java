package practicejavaprogramms;

public class FindSubStringExamp {
	
	static void findSubString(String input, String Start, String End)
	{
		
		int startIndex= input.indexOf(Start); //Mannem Sudheer REDDY -0
		int endIndex= input.indexOf(End); //R-15
		
		
		if(startIndex !=-1 && endIndex !=-1 && startIndex<endIndex) {
			
			String result=input.substring(startIndex+Start.length(), endIndex);
			System.out.println(result.trim());
			
		}
		else
		{
			System.out.println("Start String or End String Not Found");
		}
		
		
	}

	public static void main(String[] args) {
		
		findSubString("Mannem Sudheer Reddy","Mannem", "Reddy");

	}

}
