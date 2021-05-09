//2. Pattern-2
/*  
	A
	A B
	A B C
	A B C D
	A B C D E

*/
//Code:
public class Que2  
{  
	public static void main(String args[])   
	{   
		for(int i=1; i<=5; i++)  
		{   
			int alphabet = 65;
			for(int j=1; j<=i; j++)  
			{   
				System.out.print((char)(j+64)+" ");   
			} 
			alphabet++;
			System.out.println();   
		}   
	}   
}  
