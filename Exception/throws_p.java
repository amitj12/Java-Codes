class throws_p
{
public static void main(String arr[])//throws ArithmeticException
{
	int a=10,b=0,c;
	try
	{
		c=a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	
}
}