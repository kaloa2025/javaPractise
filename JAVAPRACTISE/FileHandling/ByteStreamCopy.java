package FileHandling;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamCopy {
    public static void main(String[] args) throws IOException {
        byte[] b = new byte[128];
        File f1 = new File("D:/NewFile.txt");
        f1.createNewFile();
        System.out.println("New File Created");
        try (FileInputStream fis = new FileInputStream("D:/Jav.txt");
                FileOutputStream fos = new FileOutputStream("D:/NewFile.txt")) {
            System.out.println("Bytes Available: " + fis.available());
            int count = 0;
            int read = 0;
            while ((read = fis.read(b)) != -1) {
                fos.write(b);
                count += read;
            }
            System.out.println("Wrote: " + count);
        } catch (FileNotFoundException f) {
            System.out.println("File Not Found : " + f);
        } catch (IOException e) {
            System.out.println("IOException: " + e);
        }
    }

}
