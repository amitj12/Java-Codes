import java.util.*;
class use_ref
{
	int i,j,k;
	use_ref(int a,int b)
	{
		i=a;
		j=b;
		System.out.println("before swapping "+i+" & "+j);
	}
	void swap(use_ref x)
	{
		x.i=x.i+x.j;
		x.j=x.i-x.j;
		x.i=x.i-x.j;
	}
}
class ref
{
	public static void main(String arr[])
	{
		use_ref y=new use_ref(10,20);
		y.swap(y);
		System.out.println("after swapping "+y.i+" & "+y.j);
	}
}