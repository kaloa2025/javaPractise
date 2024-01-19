package Codeforces;
/*
Shapur was an extremely gifted student. He was great at everything including Combinatorics, Algebra, Number Theory, Geometry, Calculus, etc.
He was not only smart but extraordinarily fast! He could manage to sum 1018 numbers in a single second.
One day in 230 AD Shapur was trying to find out if any one can possibly do calculations faster than him. As a result he made a very great contest
and asked every one to come and take part.In his contest he gave the contestants many different pairs of numbers. Each number is made from digits
0 or 1. The contestants should write a new number corresponding to the given pair of numbers. The rule is simple: 
The i-th digit of the answer is 1 if and only if the i-th digit of the two given numbers differ. In the other case the i-th digit of the answer 
is 0. Shapur made many numbers and first tried his own speed. He saw that he can perform these operations on numbers of length ∞ (length of a 
number is number of digits in it) in a glance! He always gives correct answers so he expects the contestants to give correct answers, too. 
He is a good fellow so he won't give anyone very big numbers and he always gives 1person numbers of samelength.Now you are going totake part in Shapur'scontest.See if you are faster&more accurate.

Input
There are two lines in each input. Each of them contains a single number. It is guaranteed that the numbers are made from 0 and 1 only and that 
their length is same. The numbers may start with 0. The length of each number doesn't exceed 100.

Output
Write one line — the corresponding answer. Do not omit the leading 0s.
*/
import java.util.*;
public class Ultra_fast_Mathematician {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        String b=sc.next();
        char[] l=new char[a.length()];
        for(int i=0;i<a.length();i++)
        {
            if(a.charAt(i)==b.charAt(i))
            {
                l[i]='0';
            }
            else
            {
                l[i]='1';
            }
        }
        for(int i=0;i<l.length;i++)
        {
            System.out.print(l[i]);
        }
    }
}

/*
 
Examples
inputCopy
1010100
0100101
outputCopy
1110001
inputCopy
000
111
outputCopy
111
inputCopy
1110
1010
outputCopy
0100
inputCopy
01110
01100
outputCopy
00010
 
 */