//41. Pattern-41
/*  
 
 99999999999999999
  888888888888888
   7777777777777
    66666666666
     555555555
      4444444
       33333
        222
         1
	 
*/
//Code:


public class Que41  
{  
	public static void main(String args[])   
	{   
		for (int i=9; i>=1; i--)
		{
			for (int j=0; j<=9-i; j++)
			{
					System.out.print(" ");
			}
			
			int count=0;
			while(count != (2*i-1))
			{
				System.out.print(i+"");  
				count++;  
			}                                               
			System.out.println();
		}
	}
}  



       
