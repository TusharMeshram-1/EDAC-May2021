//37. Pattern-37
/*  
 
			  * 
             * * 
            * * * 
           * * * * 
          * * * * * 
         * * * * * * 
        * * * * * * * 
       * * * * * * * * 
      * * * * * * * * * 
	 
*/
//Code:

public class Que37  
{  
	public static void main(String args[])   
	{   
		int number = 1;		
		for(int i=1; i<=9; i++)  
		{   
			for(int j=8; j>=i; j--)  
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



       
