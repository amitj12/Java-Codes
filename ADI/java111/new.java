import java.util.*;
class Hospital
{
	private int hno;
	private String hname,hcity;
	
	void accepte()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the hospital details:");
		System.out.println("Enter the hospital no:");
			hno=sc.nextInt();
		System.out.println("Enter the hospital Name:");
			hname=sc.next();
		System.out.println("Enter the hospital City:");
			hcity=sc.next();
	}
  	void display()
	{
		System.out.println(hno+" "+hname+" "+hcity);
	}
}
class Demo1
{
	public static void main(String args[])
	{
	Hospital x=new Hospital();
	Hospital y=new Hospital();
	Hospital z=new Hospital();
	
		x.accepte();
		y.accepte();
		z.accepte();

		x.display();
		y.display();
		z.display();
	}
}
