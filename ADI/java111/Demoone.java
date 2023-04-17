class A
{
	void add(int a,int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	void mult(float a,float b,float c)
	{
		float d=a*b*c;
		System.out.println(d);	
	}
}
class B
{
	void area(float r)
	{
		float a=3.14f*r*r;
		System.out.println(a);
	}
}
class Demo
{
	public static void main(String Args[])
	{
		A x=new A();
		x.add(7,9);
		x.mult(3.2f,1.2f,5.2f);
		
		B y=new B();
		y.area(2.88f);
	}
}