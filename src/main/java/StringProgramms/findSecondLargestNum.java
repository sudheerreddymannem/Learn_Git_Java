package StringProgramms;

public class findSecondLargestNum {
	
	static void secondLargeNum()
	{
		int num[]= {12, 45, 66,73,54,67,88,108,111,100,89,109};
		
		//Assign Lowest value for largestnum and second largest
		
		int largestNum=Integer.MIN_VALUE;  
		int SecondlargestNum=Integer.MIN_VALUE;
		
		for(int numbers:num)
		{
			if(numbers>largestNum)
			{
				SecondlargestNum=largestNum;
				largestNum=numbers;
			}
			//Next Num is greater than second Largest Num and Number Should not be in Largest
			else if(numbers>SecondlargestNum &&numbers!=largestNum)
			{
				SecondlargestNum=numbers;
			}
			
		}
		
		System.out.println("Largest Number is :"+largestNum);
		System.out.println("Second Largest Number is :"+SecondlargestNum);
		
	}

	public static void main(String[] args) {
		secondLargeNum();

	}

}
