
public class ConvertChars {

	static void covertCharacts(String name)
	{
		//Use Character Class
		//name=sudhEeRreDDyMaNNeM
		char ch[]=name.toCharArray();
		StringBuilder result=new StringBuilder();
		
		for(char carats:ch)  
		{
			if(Character.isLowerCase(carats))
			{
				result.append(Character.toUpperCase(carats));
			}
			else if(Character.isUpperCase(carats))
			{
				result.append(Character.toLowerCase(carats));
			}
			else
			{
				result.append(" ");
			}
		}
		System.out.println(result);
	}
	public static void main(String[] args) {
		
		covertCharacts("sudhEeRreDDyMaNNeM");
	

	}

}
