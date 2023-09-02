package Testing;
public class FirstNonRepeatedCharacterInString {
	public static void main(String[] args) {
	String str="mumbai";
	int i=0;
	int j=0;
	char temp;
	char arr[]=str.toCharArray();
	while(i<arr.length)
	{
		temp=arr[i];
		int cnt=0;
		for(j=0;j<arr.length;j++)
		{
			if(temp==arr[j])
			{
				cnt=cnt+1;
			}}
			if(cnt==1)
			{
				System.out.println("First Non Repeated element: "+ temp);
				break;
			}
		i++;
		}}}