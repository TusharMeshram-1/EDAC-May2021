//18. Pattern-18
/*  
 
A B C D E
A B C D
A B C
A B
A

*/
//Code:

public class Que18  
{  
	public static void main(String args[])   
	{   
		int alphabet = 70;
		for(int i=1; i<=5; i++)  
		{   
			for(int j=5; j>=i; j--)  
			{   
				System.out.print((char)(alphabet - j)+" ");   
			} 
			System.out.println();   
		}   
	}   
}  


