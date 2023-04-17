import java.io.FileWriter;
import java.io.IOException;
import java.io.StringWriter;

public class string_b {
    public static void main(String args[]) {
        try
        {
        FileWriter x=new FileWriter("outp.txt");
    StringWriter y=new StringWriter();
    y.write("Good Work");
    x.write(y.toString());
    y.close();
        x.close();
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
}
}
