import java.util.*;
class joi extends Thread
{
public void run()
{

for(int i=0;i<5;i++)
{
	try
	{
		Thread.sleep(4000);
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
	System.out.println(i);
}
}
}
class join_me
{
public static void main(String arr[])throws InterruptedException
{
joi x=new joi();
joi y=new joi();
joi z=new joi();

x.start();
// try
// {
x.join();
// }
// catch(InterruptedException e)
// {
// 	System.out.println(e);
// }
y.start();
z.start();
}
}