package Testing;
import java.util.*;
public class FrequencyOfEachCharacterInString {

	public static void main(String[] args) {
		
String s="Rajaram";
HashMap<Character,Integer> obj=new HashMap<>();
for (int i=0;i<s.length();i++)
{
	Character ch=s.charAt(i);
	if(obj.containsKey(ch))
	{
		obj.put(ch, obj.get(ch)+1);
	}
	else
	{
		obj.put(ch,1);
	}
}
System.out.println(obj);
		
	   }}
