//8. Pattern-8
/*   
	 5
    4 5
   3 4 5
  2 3 4 5
 1 2 3 4 5
*/
//Code:

public class Que8  
{  
	public static void main(String args[])   
	{   
		int number = 5;
		for(int i=1; i<=5; i++)  
		{   
			number = number - 1;
			for(int j=5; j>=i; j--)  
			{   
				System.out.print(" ");   
			}  
			for(int k=1; k<=i; k++)  
			{   
				System.out.print((number+k)+" ");
			}   
			System.out.println();   
		}   
	}   
}  