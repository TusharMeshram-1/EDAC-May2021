//14. Write a Java program to print an American flag on the screen.
//Code:

import java.util.Scanner;
import java.lang.*;
class Que14
{
		public static void main(String args[]) 
		{
			int i,j;
			for(i=1;i<=9;i++)
			{
				if(i%2!=0)
				{
					System.out.println("* * * * * * ===================================");
				}
				else
				{
					System.out.println(" * * * * *  ===================================");
				}
			}
			for(i=1;i<=6;i++)
			{
				System.out.println("===============================================");
			}
		}
}
