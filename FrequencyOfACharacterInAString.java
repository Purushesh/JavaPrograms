package Testing;

public class FrequencyOfACharacterInAString {

	public static void main(String[] args) {
	String s="Pallavi Shukla";
	char ch='l';
	int frequency=0;
	for(int i=0;i<s.length();i++)
	{
		if(ch==s.charAt(i))
		{
			frequency++;
		}
	}
	System.out.println(ch+"="+frequency);
	}

}
