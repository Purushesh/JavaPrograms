package Testing;

public class ReverseString {

	public static void main(String[] args) {
	String s="abcde";
	String rev="";
	int len=s.length();
	
for(int i=len-1;i>=0;i--)
{
	rev=rev+s.charAt(i);
}
System.out.println(rev);
	}

}
