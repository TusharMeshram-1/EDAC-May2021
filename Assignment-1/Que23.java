//23. Write a Java program to convert a binary number to hexadecimal number.
//Code:

import java.util.Scanner;
import java.lang.*;
class Que23 
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
				
		String str = "";
		char a[] = {'0', '1', '2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		int rem;
		
		while(dec1!=0) 
		{
			rem=dec1%16;
			dec1=dec1/16;
			str = a[rem]+str;
		}
		System.out.println("Hexadecimal number is: " +str);
	}
}