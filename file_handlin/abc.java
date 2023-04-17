import java.io.*;
class abc
{
	public static void main(String arr[])
	{
		try
		{
			FileWriter x=new FileWriter("Sample.txt");
			BufferedWriter y=new BufferedWriter(x);
			String s="amit";
			y.write(s);
			y.close();
			System.out.print("Successfully added ");
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}