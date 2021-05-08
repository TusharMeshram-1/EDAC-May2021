//15. Write a Java program to swap two variables.
//Code:

import java.util.Scanner;
import java.lang.*;

class Que15
{
		public static void main(String args[]) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter two values: ");
			int n1=sc.nextInt();
			int n2=sc.nextInt();
		
			System.out.println("Before Swap: "+n1+" "+n2); 
			n1=n1+n2;
			n2=n1-n2;
			n1=n1-n2;
			System.out.println("After Swap: "+n1+" "+n2);
		}
}
