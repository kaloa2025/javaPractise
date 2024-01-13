package Concurrency;

public class ExampleRunnable implements Runnable
{
    private final String name;
    public ExampleRunnable(String name)
    {this.name=name;}
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(name +" "+i);
        }
    }
}