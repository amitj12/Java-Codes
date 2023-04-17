import java.util.*;
class Empolyee
{
	private int eno;
	private String ename;
	private float esalary;

	void accepte()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the empolyee details: ");
		eno=sc.nextInt();
		ename=sc.next();
		esalary=sc.nextFloat();
	}
	void displaye()
	{
	 System.out.println(eno+" "+ename+" "+esalary);
	}
}
class Run
{
	public static void main(String args[])
	{
		Empolyee x=new Empolyee(); 
		Empolyee y=new Empolyee();
	
			x.accepte();
			y.accepte();

			x.displaye();
			x.displaye();
	}
} 