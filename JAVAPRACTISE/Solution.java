// /*
// You are given a rectangular board of M × N squares.
//  Also you are given an unlimited number of standard domino pieces 
//  of 2 × 1 squares. You are allowed to rotate the pieces. 
//  You are asked to place as many dominoes as possible on the board so as to 
//  meet the following conditions:
// 1. Each domino completely covers two squares.
// 2. No two dominoes overlap.
// 3. Each domino lies entirely inside the board. It is allowed to touch the
// edges of the board.
// Find the maximum number of dominoes, 
// which can be placed under these restrictions.
// Input
// In a single line you are given two integers M and N — 
// board sizes in squares (1 ≤ M ≤ N ≤ 16).
// Output
// Output one number — the maximal number of dominoes, which can be placed.
//  */

// import java.util.Scanner;

// public class Solution {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int m=sc.nextInt();
//         int n=sc.nextInt();
//         System.out.println((m*n)/2);
//     }
// }

/*
 The classic programming language of Bitland is Bit++. This language is so peculiar and complicated.
The language is that peculiar as it has exactly one variable, called x. Also, there are two operatins:
Operation ++ increases the value of variable x by 1.
Operation -- decreases the value of variable x by 1.
A statement in language Bit++ is a sequence, consisting of exactly one operation and one variable x. 
The statement is written without spaces, that is, it can only contain characters "+", "-", "X". 
Executing a statement means applying the operation it contains.
A programme in Bit++ is a sequence of statements, each of them needs to be executed. 
Executing a programme means executing all the statements it contains.
You're given a programme in language Bit++. The initial value of x is 0. 
Execute the programme and find its final value (the value of the variable when this programme is executed).

Input
The first line contains a single integer n (1 ≤ n ≤ 150) — the number of statements in the programme.
Next n lines contain a statement each. Each statement contains exactly one operation (++ or --) and 
exactly one variable x (denoted as letter «X»). Thus, there are no empty statements. 
The operation and the variable can be written in any order.

Output
Print a single integer — the final value of x.
//  */
// import java.util.Scanner;

// public class Solution{
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int x=0;
//         String[] a=new String[n];
//         for(int i=0;i<n;i++)
//         {
//             a[i]=sc.next();
//             if(a[i].charAt(1)=='+')
//             {x++;}
//             else
//             {x--;}
//         }
//         System.out.println(x);
//     }
// }

/* package codechef; // don't place package name! */

// import java.util.*;
// import java.lang.*;
// import java.io.*;

// /* Name of the class has to be "Main" only if the class is public. */
// class Solution
// {
// 	public static void main (String[] args) throws java.lang.Exception
// 	{
//         int t;
// 		Scanner sc=new Scanner(System.in);
// 		t=sc.nextInt();
// 		while(t>0)
// 		{
// 		    int n=sc.nextInt();
// 		    int largestPowerOf2 = 0;
// 		    while(n%2==0)
// 		    {
// 		        n/=2;
// 		        largestPowerOf2++;
// 		    }
// 		    if(largestPowerOf2%2==0)
// 		    {
// 		        System.out.println(1);
// 		    }
// 		    else
// 		    {
// 		        System.out.println(0);
// 		    }
		    
// 		    t--;
// 	}
// }
// }

/*
 Little Petya loves presents. His mum bought him two strings of the same size for his birthday. 
 The strings consist of uppercase and lowercase Latin letters. Now Petya wants to compare those two strings 
 lexicographically. The letters' case does not matter, that is an uppercase letter is considered equivalent 
 to the corresponding lowercase letter. Help Petya perform the comparison.
Input
Each of the first two lines contains a bought string. The strings' lengths range from 1 to 100 inclusive. 
It is guaranteed that the strings are of the same length and also consist of uppercase and lowercase Latin 
letters.
Output
If the first string is less than the second one, print "-1". If the second string is less than the first one, 
print "1". If the strings are equal, print "0". Note that the letters' case is not taken into consideration 
when the strings are compared.
 */