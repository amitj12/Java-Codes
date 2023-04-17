import java.util.Scanner;
import java.io.*;
import java.io.*;
class Str
{
	public static void main(String args[])
	{
	 String s="Aadinath", rstr="";
	 char ch;
	
	 System.out.println("string: ");
	 
	
	
	for(int i=0; i<s.length(); i++)
	{
		ch=s.charAt(i);
		rstr= ch+rstr;
	}
	System.out.println("Reverse string is: "+rstr);
	}
	
	
}
