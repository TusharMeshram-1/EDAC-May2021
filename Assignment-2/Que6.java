//6. Pattern-6
/*  
	  *
     **
    ***
   ****
  *****
*/
//Code:

public class Que6  
{  
	public static void main(String args[])   
	{   
		for(int i=0; i<=5; i++)  
		{   
			for(int j=5; j>=i; j--)  
			{   
				System.out.print(" ");   
			}  
			for(int k=1; k<=i; k++)  
			{   
				System.out.print("*");   
			}   
			System.out.println();   
		}   
	}   
}  
