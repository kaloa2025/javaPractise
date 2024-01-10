package zCF;
import java.util.*;
public class Sisters 
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
        double n=sc.nextDouble();
        double ans=0;
        ans=Math.ceil((n/2)-1);
        System.out.println((int)ans);
        t--;
    }
}
}
