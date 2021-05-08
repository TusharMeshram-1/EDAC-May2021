//7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
//Code:

import java.util.Scanner;
import java.lang.*; 
class Que7 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Input a number:");
		int n=sc.nextInt();
		int i;
		
		for(i=1;i<11;i++)
		{      
			int m=n*i;                       
			System.out.println(n+" x "+i+" = "+m);
		}
	}
}