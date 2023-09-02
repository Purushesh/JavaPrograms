package Testing;

public class FirstWordUppercase {

	public static void main(String[] args) {
		String s = "Everyone loves java";
		String word [] =s.split("\\s");
		String result="";
		for(String w:word)
		{
			String first=w.substring(0, 1).toUpperCase();
			String reststring=w.substring(1);
			result=result+first+reststring+" ";
		}
		System.out.print(result.trim());
}}
