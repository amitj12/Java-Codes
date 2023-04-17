import java.util.*;
class ajit
{
	public static void main(String ar[])
	{
		Scanner sc=new Scanner(System.in);
		int n;
		n=sc.nextInt();
		
		
		if(n<0)
		{
			throw new NegativeException();
		}
		else
		{	
			if(n%2==0)
			{	
				System.out.println("No is even");
			}
			else
			{	
				System.out.println("No is odd");
			}	

		}
	}
}
class NegativeException extends RuntimeException
{
	NegativeException()
	{
		System.out.println("No is negatiove");

	}	
}