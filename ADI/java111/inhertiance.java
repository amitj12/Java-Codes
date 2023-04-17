import java.util.*;
class Student
{
	
	 int rno;
	 String name;
	 String course;
	
		void display()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student details: ");
				rno=sc.nextInt();
				name=sc.next();
				course=sc.next();

			System.out.println(rno+" "+name+" "+course);
		}
}
class Percent extends Student
{
	 int m1;
	 int m2;
	 int m3;
	 int t;
	 float p;
	
		void mark()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter student marks: ");
				m1=sc.nextInt();
				m2=sc.nextInt();
				m3=sc.nextInt();
			t=m1+m2+m3;
			System.out.println(t);
		}
		void per()
		{
		  p=(t*100)/300;
		  System.out.println(p);
		}
}
class Aadii
{
	public static void main(String p[])
	{
	   Percent x=new Percent();
		
		x.mark();
		x.per();
		
	}
}	