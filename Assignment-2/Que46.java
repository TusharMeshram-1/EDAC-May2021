//46. Pattern-46
/*  
 
* * * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
 
*/
//Code:

public class Que46  
{  
	public static void main(String args[])	
	{   
		for(int i = 1; i <= 6; i++)
		{
			for(int j = 1; j <=i-1; j++)
			{
				System.out.print(" ");
			}
			
			for(int k = 0; k <= 6-i; k++)
			{
				System.out.print("*"+" ");
		    }
			System.out.println();      
		}   
	}   
}  