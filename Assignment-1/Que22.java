//22. Write a Java program to convert a binary number to decimal number.
//Code:

import java.util.Scanner;
import java.lang.*;
class Que22 
{
	public static void main(String args[]) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Input a Binary Number:" );
		int num1 = sc.nextInt();
		
		int count1=0;
		int rem1;
		int dec1=0;
		while(num1!=0)
		{
			rem1=num1%10;
			num1/=10;
			dec1+=rem1*(int)Math.pow(2,count1++);
		}
		System.out.println("Decimal Number:" + dec1 );
	}
}