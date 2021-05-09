//10. Pattern-10
/*   
     E
    D E
   C D E
  B C D E
 A B C D E
 
*/
//Code:

public class Que10  
{  
	public static void main(String args[])   
	{   
		int number = 69;		
		for(int i=1; i<=5; i++)  
		{   
			number = number - 1;
			for(int j=5; j>=i; j--)  
			{   			
				System.out.print(" ");   
			}  
			for(int k=1; k<=i; k++)  
			{   
				System.out.print((char)(number+k)+" ");
			}   
			System.out.println();   
		}   
	}   
}  
