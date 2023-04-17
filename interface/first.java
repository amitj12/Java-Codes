interface a
{
	void one();
	void two();
}
class fir implements a
{
	public void one()
	{
		System.out.print("Hello ");
	}	
	public void two()
	{
		System.out.print("World ");
	}
}
class first
{
	public static void main(String arrg[])
	{
		fir x=new fir();
		x.one();
		x.two();
	}
}