//21. Write a Java program to convert a decimal number to octal number.

//Code:
import java.util.Scanner;
import java.lang.*;
public class Que21 
{
	public static void main(String args[]) 
	{
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Input a Decimal Number: " );
		int a = sc.nextInt();
				
		int count =0;
		int dec =0;

		int remainder;
		String str ="";
		
		while(a!=0) 
		{
			remainder=a%8;
			a=a/8;
			str = remainder+str;
		}
			System.out.println("Octal number is:  " +str);
	}
}