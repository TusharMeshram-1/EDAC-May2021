//11. Pattern-11
/*   
	 E
    D E
   C D E
  B C D E
 A B C D E
*/
//Code:

public class Que11  
{  
	public static void main(String args[])   
	{   
		int number = 1;		
		for(int i=1; i<=5; i++)  
		{   
			for(int j=4; j>=i; j--)  
			{   			
				System.out.print(" ");   
			}  
			for(int k=1; k<=number; k++)  
			{   
				System.out.print("*");
			}   
			number = number + 2;
			System.out.println();   
		}   
	}   
}  