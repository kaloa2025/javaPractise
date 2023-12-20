package Exception;
import java.io.*;
import java.util.*;
public class JDTry {
    private List<Integer> list;
    private static final int SIZE=10;
    public void writeList()
    {
        PrintWriter out =null;
        try
        {
            System.out.println("Entered try statement");
            out= new PrintWriter(new FileWriter("OutFile.txt"));
            for(int i=0;i<SIZE;i++)
            {
                out.println("Value at: "+i+"="+list.get(i));
            }
        }catch (IndexOutOfBoundsException e)
        {
            System.out.println("IndexOutOfBoundsException: "+e.getMessage());
        }catch (IOException e)
        {
            System.out.println("IOException: "+e.getMessage());
        }catch (NullPointerException e)
        {
            System.out.println("NullPointerException: "+e.getMessage());
        }
        finally
        {
            if(out!=null)
            {
                System.out.println("Closing PrintWriter");
                out.close();
            }
            else
            {
                System.out.println("PrintWriter not Open");
                out.close();
            }
        }
    }
    public static void main(String[] args) {
        JDTry j=new JDTry();
        j.writeList();
    }
}