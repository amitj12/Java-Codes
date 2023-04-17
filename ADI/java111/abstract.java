import java.util.*;

abstract class shape
{
	abstract void volume();
	abstract void accepte();
};

class cylinder extends shape
{
	int r,h;
	float v;
	
	void accepte()
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius and height of Cylinder: ");
		r=sc.nextInt();
		h=sc.nextInt();
	}
	void volume()
	{
		
		v=3.14f*r*r*h;
		System.out.println("Volume of cylinder is: " +v);
	}
};

class sphere extends shape
{
	int r;
	float v;
	void accepte()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of Sphere: ");
			r=sc.nextInt();
	}
	void volume()
	{
		v=1.33f*3.14f*r*r*r;
		System.out.println(" volume of spher is: " +v);
	}
};

class main
{
	public static void main(String args[])
	{
	
		shape y=new cylinder();
		y.accepte();
		y.volume();

		shape x=new sphere();
		x.accepte();
		x.volume();
		
	}
}
			