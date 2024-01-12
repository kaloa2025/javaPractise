package Codeforces;
/*
For a positive integer n let's define a function f:
f(n) =  - 1 + 2 - 3 + .. + ( - 1)nn
Your task is to calculate f(n) for a given integer n.
Input
The single line contains the positive integer n (1 ≤ n ≤ 1015).
Output
Print f(n) in a single line.

Examples
inputCopy
4
outputCopy
2
inputCopy
5
outputCopy
-3
Note
f(4) =  - 1 + 2 - 3 + 4 = 2

f(5) =  - 1 + 2 - 3 + 4 - 5 =  - 3
 */
import java.util.*;
public class Funtnion {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        long n=sc.nextLong();
        long z=0;
        if(n%2==0){z=(n)/2;}
        else{z=(-n-1)/2;}
        System.out.println(z);
    }
}