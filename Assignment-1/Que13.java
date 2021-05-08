//13. Write a Java program to print the area and perimeter of a rectangle.
//Code:

import java.util.Scanner;
import java.lang.*;
import java.io.*;

public class Que13
{
		public static void main(String args[]) 
		{
			float w=5.5f;
			float h=8.5f;
			float perimeter = 2 * (w+h);
			float area = w*h ;

			System.out.println("Perimeter is 2*(5.6+8.5)= ");
			System.out.format("%.2f",perimeter);
			System.out.println();
			System.out.println("Area is 5.6*8.5 = ");
			System.out.format("%.2f",area);
		}
}

