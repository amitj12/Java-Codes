class mul implements Runnable
{
	
	public void run()
	{
        try
        {
		for(int i=0;i<30;i++)
		{
			System.out.println(i);
            Thread.sleep(2000);
		}
    }
    catch(InterruptedException e)
{
    System.out.println(e);
}
    }
}
class Sus_res
{
public static void main(String arr[])//throws InterruptedException
{
	mul y=new mul();
	Thread x=new Thread(y);
    Thread z=new Thread(y);
	x.start();
    try
    {

    x.suspend();
    Thread.sleep(5000);
    x.resume();
    }
    catch(InterruptedException e)
    {
        System.out.println(e);
    }
	
	//System.out.println(x.isAlive());
}
}