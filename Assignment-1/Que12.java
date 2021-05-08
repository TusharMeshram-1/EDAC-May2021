//12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
//Code:

import java.util.Scanner;
import java.lang.*;
public class Que12
{
		public static void main(String args[]) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter three numbers:");  
			int n1=sc.nextInt();
			int n2=sc.nextInt();
			int n3=sc.nextInt();
			int avg;
  
			avg=(n1+n2+n3)/3;
			System.out.println("Average = "+avg);
		}
}

