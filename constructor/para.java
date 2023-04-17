import java.util.*;

class rectangle
{
	rectangle(int p,int q)
	{
		int a=p,b=q,c;
		c=a*b;
		System.out.println("Area of rectangle = "+c);
	}
}
class para
{
	public static void main(String arr[])
	{
		rectangle x=new rectangle(10,20);
	}
}	