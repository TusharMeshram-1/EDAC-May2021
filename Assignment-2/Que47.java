//47. Pattern-47
/*  
 
     *
    * *
   *   *
  *     *
 *       *
***********


*/
//Code:

public class Que47 
{  
	public static void main(String args[])	
	{   
		for(int i=1; i<=6; i++)
		{
			for(int j=i; j<6; j++)
			{
				System.out.print(" "); 
			} 
			for(int k=1; k<2*i; k++)
			{
				if(i==6 || (k==1 || k==2*i-1))
					System.out.print("*"); 
				else 
					System.out.print(" "); 
            }
			System.out.println();      
		}   
	}   
}  