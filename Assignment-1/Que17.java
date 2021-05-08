//17. Write a Java program to add two binary numbers.
//Code:


import java.util.Scanner;
import java.lang.*;
class Que17
{
		public static void main(String args[])
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("Input first binary number: ");
			int n1=sc.nextInt();
			System.out.print("Input second binary number: ");
			int n2=sc.nextInt();
			int c1=0,c2=0, rem1=0,rem2=0;
			int d1=0,d2=0;
			while(n1!=0)
			{
				rem1=n1%10;
				n1/=10;
				d1=d1+rem1*(int)Math.pow(2,c1++);
			}
			while(n2!=0)
			{
					rem2=n2%10;
					n2/=10;
					d2=d2+rem2*(int)Math.pow(2,c2++);
			}
			int n3=d1+d2;
			int rem3;
			String a="";
			while(n3!=0)
			{
				rem3=n3%2;
				n3/=2;
				a=rem3+a;
			}
			System.out.println("Sum of two binary number: "+a);

		}
}



