package Codeforces;
/*
You are given two positive integers a and b . In one move you can increase a by 1 (replace a with a+1). Your task is to find the minimum number 
of moves you need to do in order to make a divisible by b.
It is possible, that you have to make 0 moves, as a is already divisible by b. You have to answer t independent test cases.
Input
The first line of the input contains one integer t the number of test cases. 
Then t test cases follow. The only line of the test case contains two integers a and b
Output
For each test case print the answer — the minimum number of moves you need to do in order to make a  divisible by b
 */
import java.util.*;
public class Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++)
        {
            long a=sc.nextLong();
            long b=sc.nextLong();
            long count=0;
            if(a%b==0)
            {System.out.println(0);}
            else
            {
                if(a<b)
                {count=b-a;}
                else
                {
                    long z=a/b;
                    count=(b*(z+1))-a;
                }
                System.out.println(count);
            }
        }
    }
}
/*
 
Example
inputCopy
5
10 4
13 9
100 13
123 456
92 46
outputCopy
2
5
4
333
0
 */