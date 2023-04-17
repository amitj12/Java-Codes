import java.util.*;
class Even
{
	public static void main(String p[])
	{  
		Scanner sc=new Scanner(System.in);
	        int n,i,s=0;
	  	System.out.println("Enter n: ");
		n=sc.nextInt();

	
		int a[]=new int[n];
		for(i=0; i<n; i++)
		{
			System.out.println("enter no: ");
				a[i]=sc.nextInt();
		}
		System.out.println("Display All elements");
		for(i=0; i<n; i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Even no sum: ");
		for(i=0; i<n; i++)
		{
			if(a[i]%2==0)
			{
				s=s+a[i];
				continue;
			}
		}
		System.out.println(s);
     	}
}

		