//12. Pattern-12
/*   
     1
    2 2
   3 3 3
  4 4 4 4
 5 5 5 5 5
 
*/
//Code:


public class Que12  
{  
	public static void main(String args[])   
	{   		
		for(int i=1; i<=5; i++)  
		{   
			for(int j=5; j>=1; j--)  
			{   
				if(j>i)
				{
				System.out.print(" ");   
				} 
				else
				{
					System.out.print(" "+i);
			    } 
		     }			
			System.out.println();   
		}   
	}   
}  

