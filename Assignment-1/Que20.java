//20. Write a Java program to convert a decimal number to hexadecimal number.
//Code:

import java.util.Scanner;
import java.lang.*;
class Que20 
{
		public static void main(String args[]) 
		{
		
			Scanner sc = new Scanner (System.in);
			
			System.out.println("Input a decimal number: " );
			int num = sc.nextInt();
					
			String str = "";
			char a[] = {'0', '1', '2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
			int rem;
		
			while(num!=0) 
			{
				rem=num%16;
				num=num/16;
				str = a[rem]+str;
			}
			System.out.println("Hexadecimal number is: " +str);
		}
}