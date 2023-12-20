package Exception;
import java.util.*;
import java.io.*;
public class TryResources {
    public static void main(String[] args) {
        System.out.println("About to open a file");

        try(InputStream in=new FileInputStream("missingfile.txt"))
        {
            System.out.println("File Open");
            int data=in.read();
        }
        catch(FileNotFoundException e)
        {
            System.out.println(e.getMessage());
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
}