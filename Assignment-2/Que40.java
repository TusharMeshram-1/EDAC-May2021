//40. Pattern-40
/*  
 
*****************
 ***************
  *************
   ***********
    *********
     *******
      *****
       ***
        *
	 
*/
//Code:

public class Que40  
{  
	public static void main(String args[])   
	{   
		for(int i = 9; i >= 1; i--)
     {
         for(int j = i ;j < 9; j++)
         {
             System.out.print(" ");
         }
         for(int k =1; k <= (2*i-1); k++)
         {
             System.out.print("*");
         }
         System.out.println();
		}
	}
}  



       
