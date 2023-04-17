import java.util.*;

class Rectangle
{
    public static void main(String args[])
    {
      float l,b,a;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter l and b: ");

      l=sc.nextFloat();
      b=sc.nextFloat();
      a=l*b;

      System.out.println("Area of Ractangle is: "+a);
    }
}