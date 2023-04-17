class mul implements Runnable
{
	
	public void run()
	{
        synchronized(this)
        {
        try
        {
		for(int i=0;i<30;i++)
		{
			System.out.println(i);
            Thread.sleep(200);
		}
    }
    catch(InterruptedException e)
{
    System.out.println(e);
}
    }
}
}
class main1
{
public static void main(String arr[])//throws InterruptedException
{
	mul y=new mul();
	Thread x=new Thread(y);
    Thread z=new Thread(y);
	x.start();
  //  y.start();
    z.start();
}
}