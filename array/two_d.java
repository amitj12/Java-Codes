import java.util.*;
class two_d
{
	public static void main(String a[])
	{
		int n[][]={{1,2,3},{4,5,6},{7,8,9}};
		int m[][]={{1,2,3},{4,5,6},{7,8,9}};
		int c[][]=new int[3][3];
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=n[i][j]+m[i][j];
			}
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(i==j)
				{
					c[i][j]=0;
				}
			}
	
		}
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j]+" ");
			}
			System.out.print("\n ");
		}
	}
}