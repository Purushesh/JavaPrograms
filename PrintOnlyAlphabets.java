package Testing;

public class PrintOnlyAlphabets {

	public static void main(String[] args) {
		String str= "7puru@shu5kla";   
		str = str.replaceAll("[^a-zA-Z]", "");  
		System.out.println(str); 
	}}
