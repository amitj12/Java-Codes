import java.io.*;
class inpu
{
public static void main(String arr[])
{
	byte a[]=new byte[100];
	try
	{
		InputStream x =new FileInputStream("sample.txt");
		x.read(a);
		String data= new String(a);
		System.out.println(data);
	}
	catch(IOException e)
	{
		System.out.println(e);
	}
}
}