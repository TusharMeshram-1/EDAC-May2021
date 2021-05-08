//19. Write a Java program to convert a decimal number to binary number.
//Code:

import java.util.Scanner;
import java.lang.*;
public class Que19
{
		public static void main(String args[])
		{
			  Scanner sc=new Scanner(System.in);
			  System.out.println("Input a Decimal Number: " );
			  int a = sc.nextInt();
				
		      long binaryNumber =0;
		      int remainder, i=1;
		
		      while(a!=0) 
			  {
					remainder=a%2;
					a=a/2;
					binaryNumber=binaryNumber+remainder*i;
					i=i*10;
			  }
			  System.out.println("Binary number is: " +binaryNumber);

        }
}



