
public class CountVoAndConso {
	
	static void countVowandCon(String name)
	{
		//name=sudheer
		
		String str=name.toLowerCase();
		
		int vowels=0;
		int consonants=0;
		
		for(int i=0;i<name.length();i++)
		{
			char ch=str.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				if(ch=='a' || ch=='e' || ch=='i' || ch=='o' ||ch=='u')
				{
					vowels++;
				}
				else
				{
					consonants++;
				}
			}
			
			
		}
		System.out.println("Vowels are "+vowels);
		System.out.println("Consonants are "+consonants);	
	}

	public static void main(String[] args) {
		
		countVowandCon("sudheer");
	}

}
