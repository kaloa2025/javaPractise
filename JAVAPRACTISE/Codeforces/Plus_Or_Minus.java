package Codeforces;
/*
You are given three integers a, b, and c such that exactly one of these two equations is true:
a+b=c a−b=c
Output + if the first equation is true, and - otherwise.
Input
The first line contains a single integer t — the number of test cases.
The description of each test case consists of three integers a, b, c. The additional constraint on the input: 
it will be generated so that exactly one of the two equations will be true.
Output
For each test case, output either + or - on a new line, representing the correct equation.
*/
import java.util.*;
public class Plus_Or_Minus {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t>0)
    {
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a+b==c)
        {
            System.out.println("+");
        }
        else
        {
            System.out.println("-");
        }
        t--;
    }
}    
}
/*
 
Example
inputCopy
11
1 2 3
3 2 1
2 9 -7
3 4 7
1 1 2
1 1 0
3 3 6
9 9 18
9 9 0
1 9 -8
1 9 10
outputCopy
+
-
-
+
+
-
+
+
-
-
+
Note
In the first test case, 1+2=3
.

In the second test case, 3−2=1
.

In the third test case, 2−9=−7
. Note that c
 can be negative.
 
 */