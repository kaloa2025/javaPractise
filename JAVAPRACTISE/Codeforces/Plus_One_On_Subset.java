package Codeforces;

import java.util.Scanner;
public class Plus_One_On_Subset {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            long n=sc.nextLong();
            long max=0;
            long min=1000000007;
            for(long p=0;p<n;p++)
            {
                long x=sc.nextLong();
                min=(min<x)?min:x;
                max=(max>x)?max:x;
            }
            System.out.println(max-min);
            t--;
        }
    }
}