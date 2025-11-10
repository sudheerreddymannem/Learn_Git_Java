package StringProgramms;

public class StringBetweenStrings {
	
	public void textBetweenStrings(String input, String start, String End)
	{
		//input String , Start Staring and End String
		//Find index of Start and end
		//condition to check if the Start and End not FOund
		//Extract text between Start and End
		
		int startindex=input.indexOf(start);
		System.out.println("Startindex :"+startindex); //Mannem= 0
		int endindex=input.indexOf(End);
		System.out.println("EndIndex :"+endindex); //Reddy=15 including spaces
		
		//Condition string lekapothe -1// return chesthadi
		if(startindex!=-1 && endindex!=-1 && startindex <endindex)
		{
			
			String middleString=input.substring(startindex+start.length(),endindex);
			System.out.println(middleString.trim().replaceAll(" ", ""));
			System.out.println(startindex+start.length());
		}
		else {
			System.out.println("Start/End String not Found");
		}
		
		
		
	}

	public static void main(String[] args) {
		StringBetweenStrings str=new StringBetweenStrings();
		
		String input="Mannem Sudheer Kumar Reddy";
		String start="Mannem";
		String end="Reddy";
		
		str.textBetweenStrings(input, start, end);

	}

}
