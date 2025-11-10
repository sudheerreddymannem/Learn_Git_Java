package StringProgramms;

public class reverseInteger {
	
	static void reverseAnInteger(int num)
	{
		int reversed=0;  //12345
		
		while(num!=0)
		{
			//get Last digit using - get reminder from num
			int digit=num%10;
			//add it to reversed
			reversed=reversed*10+digit;
			num/=10;	
			
		}
		System.out.println("Reversed Number is :"+reversed);
		
	}

	public static void main(String[] args) {
		
		reverseAnInteger(12345);
		

	}

}
