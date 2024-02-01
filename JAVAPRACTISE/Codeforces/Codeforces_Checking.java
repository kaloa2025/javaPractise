package Codeforces;
/*
Given a lowercase Latin character (letter), check if it appears in the string codeforces

Input
The first line of the input contains an integer t the number of test cases.
The only line of each test case contains a character c — a single lowercase Latin character (letter).
Output
For each test case, output "YES" (without quotes) if c
 satisfies the condition, and "NO" (without quotes) otherwise.

You can output the answer in any case (for example, the strings "yEs", "yes", "Yes" and "YES" will be recognized as a positive answer).
 */
import java.util.*;
public class Codeforces_Checking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String s="codeforces";
            char c=sc.next().charAt(0);
            if(s.indexOf(c)>-1)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            t--;
        }
    }
}
