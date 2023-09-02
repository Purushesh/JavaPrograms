package Testing;

public class AllNonRepeatedUniqueCharacter {

	public static void main(String[] args) {
    int i=0;
    int j=0;
    String str="mumbai";
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
    		System.out.println("All Non Repeated elements :" + temp);
    	}
    	i++;
    	
    }
	}}
