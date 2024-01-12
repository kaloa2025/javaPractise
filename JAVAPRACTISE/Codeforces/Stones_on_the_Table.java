package Codeforces;
import java.util.Scanner;
import java.util.*;
/*
 There are n stones on the table in a row, each of them can be red, green or blue. 
 Count the minimum number of stones to take from the table so that any two neighboring stones had different 
 colors. Stones in a row are considered neighboring if there are no other stones between them.
Input
The first line contains integer n (1 ≤ n ≤ 50) — the number of stones on the table.
The next line contains string s, which represents the colors of the stones. We'll consider the stones in the 
row numbered from 1 to n from left to right. Then the i-th character s equals "R", if the i-th stone is red, 
"G", if it's green and "B", if it's blue.
Output
Print a single integer — the answer to the problem.
Examples
inputCopy
3
RRG
outputCopy
1
 */
public class Stones_on_the_Table {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int count=0;
        ArrayList<Character> l=new ArrayList<>();
        for(int i=0;i<s.length();i++)
        {
            l.add(s.charAt(i));
        }
        while(n>0)
        {
            for(int i=0;i<l.size()-1;i++)
        {
            if(l.get(i)==l.get(i+1))
            {
                l.remove(i+1);
            }
        }
        for(int i=1;i<l.size();i++)
        {
            if(l.get(i)==l.get(i-1))
            {
                l.remove(i);
            }
        }
        n--;
        }
        System.out.println(s.length()-l.size());
    }
}
