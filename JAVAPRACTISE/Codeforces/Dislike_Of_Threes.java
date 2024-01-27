package Codeforces;
/*
Polycarp doesn't like integers that are divisible by 3 or end with the digit 3
in their decimal representation. Integers that meet both conditions are disliked by Polycarp, too.
Polycarp starts to write out the positive (greater than 0) integers which he likes: 1,2,4,5,7,8,10,11,14,16,…
. Output the k-th element of this sequence (the elements are numbered from 1).

Input
The first line contains one integer t — the number of test cases. Then t
test cases follow.Each test case consists of one line containing one integer k.
Output
For each test case, output in a separate line one integer x — the k-th element of the sequence that was written out by Polycarp.

*/
import java.util.*;
public class Dislike_Of_Threes {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int k=sc.nextInt();
            int i=0,count=k;
            while(count>0)
            {
                if(i%3==0||i%10==3)
                {
                }
                else
                {
                    count--;
                }
                i++;
            }
            System.out.println(i-1);
            t--;
        }
    }
}
/*
Example
inputCopy
10
1
2
3
4
5
6
7
8
9
1000
outputCopy
1
2
4
5
7
8
10
11
14
1666
 
 */