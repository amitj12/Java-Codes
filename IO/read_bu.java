import java.io.FileWriter;
import java.io.IOException;
import java.io.*;

public class read_bu {
    public static void main(String args[]) {
    try
    {
        FileReaders x=new FileReader("out_p.txt");
    }
    catch(IOException e)
    {
        System.out.println(e);
    }
}
}
