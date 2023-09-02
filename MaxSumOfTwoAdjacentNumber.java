package Testing;

public class MaxSumOfTwoAdjacentNumber {

	public static void main(String[] args)
	{
		int[] arr = { 2, 5, 3, 3, 3, 3, 1, 7 } ;
		int[] newArr = new int[arr.length - 1];
		int highest = arr[0]+arr[1];
		for (int i = 0; i <arr.length-1; i++)
	    {
		newArr[i] = arr[i] + arr[i + 1];
		if (newArr[i]>highest) 
		{
		highest = newArr[i];
		System.out.println("no one is " + arr[i] + " and no two is "+ arr[i+1]);
		}}
		System.out.println("Highest NO : " + highest);
	}}
