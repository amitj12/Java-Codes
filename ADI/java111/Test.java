import java.util.*;

class Demo
{
   static int a;
          int b;
    void one()
    {}
static void two()
{}

}
class Test
{
   public static void main (String args[])
    {
        Demo.a=11;
        Demo x=new Demo();
        x.one();
        Demo.two();
    }
}