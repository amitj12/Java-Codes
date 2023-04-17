class dis
{
String q;
int w;
float r;
	void display(int a,String b,float p)
	{
		w=a;
		r=p;
		q=b;
		System.out.println("Roll no:- "+w+"Name:- "+q+"percentage "+r);
	}
}
class Demo
{
	public static void main(String arr[])
	{
		dis x=new dis();
		dis y=new dis();
		x.display(1,"Amit",80);
		y.display(2,"ajit",90);
	}
}	