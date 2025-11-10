package practicejavaprogramms;

public class FindLargestNumber {
	
	static void largestNumber(int arr[])
	{
		//arr[]={10,20,30};
		
		int largest=arr[0]; //10
		System.out.println(largest);
		
		for(int numbers:arr)
		{
			if(numbers>largest)
			{
				largest=numbers;
			}
		}
		
		System.out.println("largest Number is:"+largest);
	}

	public static void main(String[] args) {
		
		int arr[]= {10,20,30,20,1000,500};
		
		largestNumber(arr);



	}

}
