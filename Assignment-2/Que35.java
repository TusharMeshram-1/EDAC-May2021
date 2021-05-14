//35. Pattern-35
/*  
 
	    1 
       2 2 
      3 3 3 
     4 4 4 4 
    5 5 5 5 5 
   6 6 6 6 6 6 
  7 7 7 7 7 7 7 
 8 8 8 8 8 8 8 8 
9 9 9 9 9 9 9 9 9 
	 
*/
//Code:

public class Que35  
{  
	public static void main(String args[])   
	{   
		int rowCount = 1;
	    for (int i = 9; i > 0; i--) 
		{
			for (int j = 1; j <= i; j++) 
			{
				System.out.print(" ");
            }
            for (int j = 1; j <= rowCount; j++) 
			{
				System.out.print(rowCount + " ");
            }
            System.out.println();
            rowCount++;
		}
	}
}  



       
