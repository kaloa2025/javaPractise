package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamEx {
    public static void main(String[] args) throws IOException {
        char[] c = new char[128];
        File f1 = new File("D:/NewChar.txt");
        f1.createNewFile();
        try (FileReader fr = new FileReader("D:/Jav.txt");
                FileWriter fw = new FileWriter("D:/NewChar.txt")) {
            int count = 0;
            int read = 0;
            while ((read = fr.read(c)) != -1) {
                fw.write(c);
                count += read;
            }
            System.out.println("Wrote: "+count+"character.");
        }catch(FileNotFoundException f){
            System.out.println("File not found.");
        }catch (IOException e) {
            System.out.println("IOException:  "+e);
        }
    }
    }
