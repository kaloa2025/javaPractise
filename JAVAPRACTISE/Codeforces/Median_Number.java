package Codeforces;
/*
Given three distinct integers a, b, and c, find the medium number between all of them.
The medium number is the number that is neither the minimum nor the maximum of the given three numbers.

For example, the median of 5,2,6 is 5, since the minimum is 2 and the maximum is 6.
Input
The first line contains a single integer t— the number of test cases.
The description of each test case consists of three distinct integers a, b, c
Output
For each test case, output a single integer — the medium number of the three numbers.
*/
import java.util.*;
public class Median_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            int max=Math.max(Math.max(a,b), c);
            int min=Math.min(Math.min(a,b), c);
            System.out.println(a+b+c-max-min);
            t--;
        }
    }
}
/*
Example
inputCopy
9
5 2 6
14 3 4
20 2 1
1 2 3
11 19 12
10 8 20
6 20 3
4 1 3
19 8 4
outputCopy
5
4
2
2
12
10
6
3
8
 
 */