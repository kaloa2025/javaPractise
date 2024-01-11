package niop2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Test {
    public static void main(String[] args) throws IOException{
        // Files.createDirectory(Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\Practise\\javaPractise\\JAVAPRACTISE\\newIO"));
        // System.out.println("Done");
        Path path=Paths.get("C:\\Users\\Lenovo\\OneDrive\\Desktop\\java\\Practise\\javaPractise\\JAVAPRACTISE\\newIO\\aalok.txt");
        Path createdFilePath = Files.createFile(path);
        System.out.println("Zala");
    }
}
