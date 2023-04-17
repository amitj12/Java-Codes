class Demo
{
	int a;
	void one()
	{
		 a=15;
	}
	static void two()
	{
		int  a=11;
	}
}
class Aamay
{
	public static void main(String args[])
	{

	Demo x= new Demo();
	Demo y=new Demo();
	Demo z=new Demo();
		y.one();
		Demo.two();
	}
}