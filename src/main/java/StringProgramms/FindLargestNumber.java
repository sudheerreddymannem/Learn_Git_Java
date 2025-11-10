package StringProgramms;

public class FindLargestNumber {
	
	static void findlargestNumber(int num[])
	{
		//int num[]={10,20,30,40,50};
		//Assume first num is largest
		
		int largest=num[0]; 
		
		for(int numbers:num) 
		{
			//condition - if num  greater than largest num that it is largest
			if(numbers>largest)
			{
				largest=numbers;
			}
			
		}
		System.out.println("Largest number in the Array is :"+largest);		
		
	}

	public static void main(String[] args) {
		int num[]= {50,100,500,3000};
		findlargestNumber(num);
	

	}

}
