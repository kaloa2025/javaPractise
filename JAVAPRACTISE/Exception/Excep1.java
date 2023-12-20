package Exception;

public class Excep1 {
    public static void main(String[] args) 
    {
        try
        {
            int arr[]={1,2,3};
            arr[9]=3/1;
            arr[1]=3/0;

        }
        // catch(ArithmeticException ae)
        // {
        //     System.out.println("divide by zero");
        // }
        // catch(ArrayIndexOutOfBoundsException e)
        // {
        //     System.out.println("array index out of bound exception");
        // }
        catch(Exception e)    //This block handles all Exception
        {
            System.out.println("Generic exception");
        }
    }
}
