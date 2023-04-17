import java.util.*;
class EvenNo
{
	public static void main(String args[])
	{
		LinkedList<Integer> x = new LinkedList<Integer>();
	           int n,i,no;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the how no: ");
		          n=sc.nextInt();

		for(i=1;i<=n;i++)
		{
			System.out.println("enter the no: ");
			no=sc.nextInt();
			x.add(no);
		}
		
		System.out.println("Even no are: ");
		for(Integer p: x)
		{
			int m=p.intValue();
			if(m%2==0)
			{
				System.out.println(m);
			}
		}
	}
}	
		
		