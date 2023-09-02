package Testing;
import java.util.HashSet;
public class FirstDuplicateCharacter {
	public static void main(String[] args) {
		
		String str = "mumbai";
		char[] arr = str.toCharArray(); 
		HashSet<Character> set = new HashSet<Character>();
		for (int i = 0; i < arr.length; i++) 
		{
		boolean val = set.add(arr[i]);
		if (val == false) 
		{ 
		System.out.println("First Duplicate : " + arr[i]); 
		}}
	}}
