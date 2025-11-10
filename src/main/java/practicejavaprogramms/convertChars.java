package practicejavaprogramms;

public class convertChars {
	
	static void covertCases(String input)
	{
		char[] chars=input.toCharArray();
		StringBuilder result=new StringBuilder();
		
		for(char ch:chars)
		{
			if(Character.isLowerCase(ch))
			{
				result.append(Character.toUpperCase(ch));
			}
			else if(Character.isUpperCase(ch))
			{
				result.append(Character.toLowerCase(ch));
			}
			else
			{
				result.append(" ");
			}
			
		}
		System.out.println(result.toString());
		
		
	}

	public static void main(String[] args) {


		covertCases("SUDHeeRRedd yMannem");

	}

}
