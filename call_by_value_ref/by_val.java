import java.util.*;
class by_val
{
	static void swap(int a,int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("function call swapping "+a+" & "+b);
	}
	public static void main(String arr[])
	{
		int a=10,b=20;
		System.out.println("before swapping "+a+" & "+b);
		swap(a,b);
		System.out.println("after function call swapping "+a+" & "+b);
	}
}
