package Codeforces;
import java.util.*;
public class Vasya_the_Hipster{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if (a >= b)
    {
        a -= b;
        a /= 2;
        System.out.println(b+" "+a);
    }
    else
    {
        b -= a;
        b /= 2;
        System.out.println(a+" "+b);
    }
    }
}
