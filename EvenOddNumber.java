package Testing;

import java.util.Scanner;

public class EvenOddNumber {

	public static void main(String[] args) {
		 System.out.println('a'+'b'+'c');
		System.out.println("a"+"b"+"c");
		System.out.println("Random Number: " + Math.random()); 
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Pallavi Dwivedi please enter the number :");
	 	int num=sc.nextInt();
		
		if(num%2==0)
		{
			System.out.println(num + " is an even number");
		}
		else
		{
			System.out.println(num + " is an odd number");
		}
		
	}}
