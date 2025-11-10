package practicejavaprogramms;

public class SecondLargestNumber {
	
	static void secondLargestNum(int[] numbers)
	{
	
		int LargestNum=Integer.MIN_VALUE;
		int secondLargestNum=Integer.MIN_VALUE;
		
		for(int num:numbers)
		{	
			if(num>LargestNum)
			{
				secondLargestNum=LargestNum;
				LargestNum=num;
			}
			else if(num>secondLargestNum && num!=LargestNum)
			{
				secondLargestNum=num;
			}
			
		}
		System.out.println("First Largest Number:"+LargestNum);
		System.out.println("Second Largest Number:"+secondLargestNum);
		
	}

	public static void main(String[] args) {
		
		int[] numbers= {10,12,6,15,23,44};
		secondLargestNum(numbers);
	}

}
