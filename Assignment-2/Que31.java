//31. Pattern-31
/*  
 
*****
 ****
  ***
   **
    *
   **
  ***
 ****
*****
	 
*/
//Code:

public class Que31  
{  
	public static void main(String args[])   
	{   
		for(int i=0; i<=3; i++)  
		{   
			for(int j=1; j<=i; j++)  
			{   
				System.out.print(" ");   
			}
			for(int k=1; k<=5-i; k++)  
			{   
				System.out.print("*");   
			}
			System.out.println();
		}
		for(int i=1; i<=5; i++) 
		{
			for(int k=1;k<=5-i;k++)
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


