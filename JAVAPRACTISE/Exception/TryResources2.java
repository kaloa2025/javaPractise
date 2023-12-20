package Exception;
import java.io.*;
public class TryResources2 {
    public static void main(String[] args) {
        try(BufferedReader br=new BufferedReader(new FileReader("d:\\t.txt")))
        {
            String str;
            while((str=br.readLine())!=null)
            {
                System.out.println(str);
            }
        }catch(FileNotFoundException e){
                    System.out.println("File Not Found Exception");
                }
                catch(IOException ie)
		{  
			System.out.println("exception");  
		}
        }
    }
