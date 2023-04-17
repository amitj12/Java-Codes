class mul extends Thread
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}

}
class main
{
public static void main(String arr[])
{
	mul x=new mul();
	x.start();
}
}
	