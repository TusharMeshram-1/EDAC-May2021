//39. Pattern-39
/*  
 
			         9 
                   8 9 8 
                 7 8 9 8 7 
               6 7 8 9 8 7 6 
             5 6 7 8 9 8 7 6 5 
           4 5 6 7 8 9 8 7 6 5 4 
         3 4 5 6 7 8 9 8 7 6 5 4 3 
       2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 
     1 2 3 4 5 6 7 8 9 8 7 6 5 4 3 2 1
	 
*/
//Code:

public class Que39  
{  
	public static void main(String args[])   
	{   
		int rowCount = 1;
	    for (int i = 9; i >= 1; i--) 
		{
			for (int j = 1; j <= i*2; j++) 
			{
				System.out.print(" ");
            }
            for (int k = i; k <= 9; k++) 
			{
				System.out.print(k + " ");
            }
			for (int l = 9 - 1; l >= i; l--) 
			{
				System.out.print(l + " ");
            }
            System.out.println();
            rowCount++;
		}
	}
}  



       
