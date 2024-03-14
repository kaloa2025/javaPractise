import java.util.*;
public class CP3_1 {
    public static int i=0;
    // public static void recur(int i,int n)
    // {
    //     if(i>n)
    //     {
    //         return;
    //     }
    //     System.out.println(i);
    //     recur(i+1,n);
    //     System.out.println(i);
    // }
    // public static void print(int i,int n)
    // {
    //     if(i<n)
    //     {
    //         return;
    //     }
    //     System.out.println(i);
    //     print(i-1,n);
    //     System.out.println(i);
    // }
    public static int fact(int n)
    {
        if(n==0||n==1)
        {
            return 1;
        }
        return n*fact(n-1);
    }
    public static int fib(int n)
    {
        if(n==0){return 0;}
        if(n==1){return 1;}
        return fib(n-1)+fib(n-2);
    }
    public static void prob(int n, String s)
    {
        if(n==0)
        {
            System.out.println(s);
            return;
        }
        prob(n-1,s+"H");
        prob(n-1,s+"T");
    }
    public static void friends(int index,String given,String str)
    {
        if(index==given.length())
        {
            System.out.println("=> "+str);
            return;
        }
        friends(index+1, given, str+given.charAt(index));
        friends(index+1, given, str);
    }
    public static void friendsAscii(int index,String given,String str)
    {
        if(index==given.length())
        {
            System.out.println("=> "+str);
            return;
        }
        friends(index+1, given, str+given.charAt(index));
        friends(index+1, given, str);
        friends(index+1, given, str+(int)given.charAt(index));
    }
    public static void main(String[] args) {
        // recur(1,5);
        // print(5,1);
        System.out.println(fact(5));
        System.out.println(fib(10));
        prob(3,"");
        friends(0,"abc","");
        friendsAscii(0,"abc","");
    }
}

