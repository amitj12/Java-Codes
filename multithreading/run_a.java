class mul implements Runnable
{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}

}
class run_a
{
public static void main(String arr[])throws InterruptedException
{
	mul y=new mul();
	Thread x=new Thread(y);
	x.start();
	//Thread.sleep(1);
	
	System.out.println(x.isAlive());
}
}