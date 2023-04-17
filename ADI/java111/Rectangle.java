import java.util.*;

class Rectangle
{
    public static void main(String args[])
    {
     final float pi=3.14f;
      float r,a;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter r: ");

      r=sc.nextFloat();
      //b=sc.nextFloat();
      a=1.33f*pi*r*r*r;

      System.out.println("Area of Sphere is: "+a);
    }
}