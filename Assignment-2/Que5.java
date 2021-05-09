//5. Pattern-5
/*  A
    B B
    C C C 
    D D D D
	E E E E E

*/
//Code:

public class Que5  
{  
	public static void main(String args[])   
	{   
		int alphabet = 65;
		for(int i=1; i<=5; i++)  
		{   			
			for(int j=1; j<=i; j++)  
			{   
				System.out.print((char)alphabet+" ");   
			} 
			alphabet++;
			System.out.println();   
		}   
	}   
}  