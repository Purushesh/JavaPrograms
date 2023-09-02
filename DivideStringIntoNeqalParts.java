package Testing;
public class DivideStringIntoNeqalParts {
	public static void main(String[] args) 
	{
		String s="aabbcc";
		int n=3;
		int len=s.length();
		int chars=len/n;
		int temp=0;
	
		String[] str=new String[n];
		
		if(len%n != 0)
		{
			System.out.println("Sorry String not dividable");
		}
		else
		{
			for(int i=0;i<len;i=i+chars)
			{
				String parts=s.substring(i,i+chars);
				str[temp]=parts;
				temp++;
			}
			for(int i=0;i<str.length;i++)
			{
				System.out.println(str[i]);
			}
		}
	}}
