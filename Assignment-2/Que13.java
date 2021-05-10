//13. Pattern-13
/*   
	 A
    B B
   C C C
  D D D D
 E E E E E
F F F F F F

*/
//Code:


public class Que13  
{  
	public static void main(String args[])   
	{   
		int alphabet = 64;
		for(int i=1; i<=6; i++)  
		{   
			for(int j=5; j>=i; j--)  
			{   
				System.out.print(" ");   
			} 
			for(int k=1; k<=i; k++)	
			{ 
				System.out.print((char)(alphabet+i)+" ");
		     }			
			System.out.println();   
			System.out.println();   
		}   
	}   
}  