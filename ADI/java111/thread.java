import java.util.*;
import java.lang.Thread;
class Demo implements Runnable
{
 	public void run()
	{
		synchronized(this)
		{
			System.out.println("CPP");
			try
			   {
				Thread.sleep(10000);
			   }
			catch(InterruptedException e)
			   {
				System.out.println(e);
			   }
			System.out.println("PHP");
		}
	}

	public static void main(String args[])
	{
		Demo x=new Demo();
		Thread y=new Thread(x);
		Thread z=new Thread(x);
	
			y.start();
			z.start();
	}
}