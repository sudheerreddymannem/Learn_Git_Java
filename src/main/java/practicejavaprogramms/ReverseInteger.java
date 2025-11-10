package practicejavaprogramms;

public class ReverseInteger {
	
	static void reverseAnInteger(int num)
	{
		int reversed=0;
		//12345
		while(num!=0)
		{
			int digit=num%10; //print last num
			System.out.println(digit);
			//Add to reversed
			reversed=reversed*10+digit;
			//get num removing last
			num/=10;
			
		}
		System.out.println("Reversed Number is: "+reversed);
		
	}

	public static void main(String[] args) {
		
		reverseAnInteger(12345);


		

	}

}
