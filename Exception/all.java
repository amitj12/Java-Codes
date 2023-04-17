class all
{
public static void main(String arr[])
{
	int a=10,b=0,c;
	try
	{
		c=a/b;
	}
	catch(ArithmeticException e)
	{
		System.out.println("divide zero error");
	}
	finally
	{
		System.out.println("Final block call");
	}
}
}