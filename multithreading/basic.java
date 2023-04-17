class basic extends Thread
{
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(i);
		}
	}

	public static void main(String arr[])throws InterruptedException
	{
		basic y=new basic();
		//Thread x=new Thread(y);
		y.start();
		Thread.sleep(10);
		
		System.out.println("hello");
		System.out.println("hii");
	}
}

