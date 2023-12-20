package Exception;
import java.io.FileInputStream;
import java.util.*;
import java.io.*;
public class Try1 
{
    public static void main(String[] args) {
        try
        {
            System.out.println("About to open a file");
            InputStream in =new FileInputStream("Try1.java");
            System.out.println("File Open");
            int data=in.read();
            in.close();
        }catch(FileNotFoundException e)
        {
            System.out.println(e.getClass().getName());
            System.out.println("Quitting");
        }
        catch(IOException e)
        {
            System.out.println(e.getClass().getName());
            System.out.println("Quitting");
        }
    }    
}