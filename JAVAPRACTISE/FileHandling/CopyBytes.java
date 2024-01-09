package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyBytes {
    public static void main(String[] args) throws IOException {

        FileInputStream in = null;
        FileOutputStream out = null;

        try 
        {
            in = new FileInputStream("D:/Jav.txt");
            out = new FileOutputStream("D:\\outagain.txt");
            
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
            System.out.println("DONE");
        }finally 
        {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
    }
}