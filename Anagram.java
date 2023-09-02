package Testing;
import java.util.Arrays;
public class Anagram {
	public static void main(String[] args) {
		String s1="java";
		String s2="Aa  Vj";
		
		s1=s1.replace(" ","");
		s2=s2.replace(" ","");
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
		char[] x=s1.toCharArray();
		char[] y=s2.toCharArray();
		
	    Arrays.sort(x);
	    Arrays.sort(y);
	    
	    boolean result=Arrays.equals(x,y);
	    if(result==true)
	    {
		System.out.println("String are Anagram");
	    }
	    else
	    {
	    	System.out.println("String are Not Anagram");
	    }}}
