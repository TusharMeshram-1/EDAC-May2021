//1. Pattern-1
/*      1
	1 2
	1 2 3
	1 2 3 4
	1 2 3 4 5
*/
//Code:

public class Que1  
{  
	public static void main(String args[])   
	{   
		for(int i=1; i<=5; i++)  //loop for Row
		{   
			for(int j=1; j<=i; j++)  //loop for columns
			{   
				System.out.print(j);   
			}   
			System.out.println();   
		}   
	}   
}  


