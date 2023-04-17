import java.util.*;

class student
{
	protected int rno;
	protected String rname,course;
	
	void accepte()
	{

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter students details: ");
		rno=sc.nextInt();
		rname=sc.next();
		course=sc.next();
	}
	void display()
	{
		System.out.println(+rno+" "+rname+" "+course);
	}
};
class marks extends student
{
	protected int m1,m2,m3;
	
	void accepte()
	{
		super.accepte();
		Scanner sc=new Scanner(System.in);
		m1=sc.nextInt();
		m2=sc.nextInt();
		m3=sc.nextInt();
	}
	void display()
	{
		super.display();
		System.out.println(m1+" "+m2+" "+m3);
		
	}
};
class result extends marks
{
	private int total;
	private float prn;

	void calculate()
	{
		total=m1+m2+m3;
		prn=(float)total/3.0f;
	}
	void display()
	{
		super.display();
		System.out.println(total+" "+prn);
	}
};
class multipleinheti
{
	public static void main(String args[])
	{
		int n,i;
		Scanner sc=new Scanner(System.in);
		
	System.out.println("enter no of students: ");
		n=sc.nextInt();
	    	result x[]=new result[n];
		

    	for(i=0;i<n;i++)
	{
		x[i]=new result();
		x[i].accepte();
		x[i].calculate();
	}
	
	for(i=0;i<n;i++)
	{
		x[i].display();
	}
	}
}