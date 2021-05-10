//14. Pattern-14
/*  
 
12345
1234
123
12
1

*/
//Code:

public class Que14  
{  
	public static void main(String args[])   
	{   
		for(int i=1; i<=5; i++)  
		{   
			for(int j=5; j>=i; j--)  
			{   
				System.out.print(6-j);   
			} 
			System.out.println();   
		}   
	}   
}  


