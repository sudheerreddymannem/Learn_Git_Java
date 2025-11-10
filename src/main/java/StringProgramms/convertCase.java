package StringProgramms;

public class convertCase {
	
	static void covertcases(String input)
	{
		//input=SuDhEERreDDyY
		char[] ch=input.toCharArray();
		StringBuffer result=new StringBuffer();
		
		for(char carct:ch)
		{
			//Using Character class
			if(Character.isLowerCase(carct))
			{
				result.append(Character.toUpperCase(carct));
			}
			else if(Character.isUpperCase(carct)) {
				
			result.append(Character.toLowerCase(carct));
			}
			else {
				
				result.append(" ");
			}
			
			//System.out.println(result);
		}
		
		System.out.println(result.toString());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		covertcases("SuDhEER reDDyY");

	}

}
