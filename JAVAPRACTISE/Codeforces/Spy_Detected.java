package Codeforces;
/*
You are given an array a consisting of n positive integers. It is known that in this array, all the numbers except one are the same
(for example, in the array [4,11,4,4] all numbers except one are equal to 4).
Print the index of the element that does not equal others. The numbers in the array are numbered from one.

Input
The first line contains a single integer t. Then t test cases follow.
The first line of each test case contains a single integer n — the length of the array a.

The second line of each test case contains n integers a1,a2,…,an
It is guaranteed that all the numbers except one in the a array are the same.

Output
For each test case, output a single integer — the index of the element that is not equal to others.
*/
import java.util.*;
public class Spy_Detected {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int l=0;l<t;l++)
        {
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                int count=0;
                for(int j=0;j<n;j++)
                {
                    if(i!=j&&a[i]==a[j])
                    {
                        count++;
                    } 
                }
                if(count==0)
                {
                    System.out.println(i+1);
                    break;
                }
            }
        }
    }
}
/*
 
Example
inputCopy
4
4
11 13 11 11
5
1 4 4 4 4
10
3 3 3 3 10 3 3 3 3 3
3
20 20 10
outputCopy
2
1
5
3

 
 */