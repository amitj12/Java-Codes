import java.io.*;
import java.nio.BufferOverflowException;
class buf
{
public static void main(String arr[])throws Exception
{
    FileWriter x=new FileWriter("outp.txt");
    BufferedWriter y=new BufferedWriter(x);
    String a="Ajit is bad boy ";
    y.write(a);
    y.close();

}
}
