class mul implements Runnable
{
	
	public void run()
	{
       // try
      //  {
		for(int i=0;i<30;i++)
		{
			System.out.println(i);
          // Thread.sleep(2);
		}
    }
//     catch(InterruptedException e)
// {
//     System.out.println(e);
// }
   // }
}
class sus
{
public static void main(String arr[])//throws InterruptedException
{
	mul y=new mul();
	Thread x=new Thread(y);
    Thread z=new Thread(y);
	x.start();
    z.start();
	//System.out.println(x.isAlive());
}
}