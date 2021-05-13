//25. Pattern-25
/*  
 
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *

*/
//Code:

public class Que25  
{  
	public static void main(String args[])   
	{   
		int l=1;
		for(int i=1; i<=4; i++)  
		{   
			for(int j=4; j>=i; j--)  
			{   
				System.out.print(" ");   
			} 
			for(int k=1; k<=l; k++) 
			{
				if(i==5)
				{
				}
				else
				System.out.print("*");   
			}
			l = l+2;
			System.out.println();   
		}
		int m=9;
        for(int i=1; i<=5; i++)  
		{   
			for(int j=1; j<=i-1; j++)  
			{   
				System.out.print(" ");   
			} 
			for(int k=1; k<=m; k++) 
			{
				System.out.print("*");   
			}
			m-=2;
			System.out.println();
		}
	}   
}  


