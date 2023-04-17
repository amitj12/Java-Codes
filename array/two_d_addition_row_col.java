import java.util.*;
class two_d_addition_row_col
{
	public static void main(String arrg[])
	{
		int a[][]=new int[3][3];
		int r,c;
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println("Enter Element ");
				a[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<3;i++)
		{
			r=0;
			for(int j=0;j<3;j++)
			{
				r=r+a[i][j];
			}
			System.out.println("Row addition "+r);
	
		}
		for(int i=0;i<3;i++)
		{
			c=0;
			for(int j=0;j<3;j++)
			{
				c=c+a[j][i];
			}
			System.out.println("colum "+c);
	
		}
	}
}