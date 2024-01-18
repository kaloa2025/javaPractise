package Codeforces;
/*
Polycarp has guessed three positive integers a , b  and c. He keeps these numbers in secret, but he writes down four numbers on a board in 
arbitrary order — their pairwise sums (three numbers) and sum of all three numbers (one number). So, there are four numbers on a board in random
order: a+b, a+c, b+c and a+b+c.
You have to guess three numbers a , b and c using given numbers. Print three guessed integers in any order.
Pay attention that some given numbers a , b  and c can be equal (it is also possible that a=b=c).

Input
The only line of the input contains four positive integers x1,x2,x3,x4 (2≤xi≤109) — numbers written on a board in random order. It is guaranteed 
that the answer exists for the given number x1,x2,x3,x4.

Output
Print such positive integers a, b and c that four numbers written on a board are values a+b, a+c, b+c and a+b+c
 written in some order. Print a, b and c in any order. If there are several answers, you can print any. It is guaranteed that the answer exists.
 */
import java.util.*;
public class Restore_three_Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[4];
        for(int i=0;i<4;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        int c=a[3]-a[0];
        int a1=a[3]-a[2];
        int b=a[3]-a1-c;
        System.out.println(a1+" "+b+" "+c);
    }
}
/*
Examples
inputCopy
3 6 5 4
outputCopy
2 1 3
inputCopy
40 40 40 60
outputCopy
20 20 20
inputCopy
201 101 101 200
outputCopy
1 100 100

 */