import java.util.*;
public class dem
{
	int c,d;
	public dem(int a,int b)
	{
		c=a;
		d=b;
		System.out.println(c+" "+d);
	}
	public dem(dem w)
	{
		System.out.println(w.c+" "+w.d);
		
	}	
	public static void main(String arr[])
	{
		dem x=new dem(10,20);
		dem y=new dem(x);
	}	
}

	