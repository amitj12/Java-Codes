import java.io.*;
class wr
{
public static void main(String arr[])
{
	try
	{
		FileReader x=new FileReader("Sample.txt");
		BufferedReader y=new BufferedReader(x);
		int c;
		while((c=y.read())!=-1)
		{
			System.out.print((char)c);
		}
		y.close();

	}
	catch(IOException e)
	{
		System.out.print(e);
	}
}
}