package Codeforces;
/*
Ternary numeric notation is quite popular in Berland. To telegraph the ternary number the Borze alphabet is used.
Digit 0 is transmitted as «.», 1 as «-.» and 2 as «--». You are to decode the Borze code, i.e. to find out the 
ternary number given its representation in Borze alphabet.

Input
The first line contains a number in Borze code. The length of the string is between 1 and 200 characters. 
It's guaranteed that the given string is a valid Borze code of some ternary number (this number can have leading 
zeroes).

Output
Output the decoded ternary number. It can have leading zeroes.
0«.», 1 as «-.» and 2 as «--»
*/
import java.util.*;
public class Borze {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        StringBuilder a=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
            {
                a.append('0');
            }
            else
            {
                if(s.charAt(i+1)=='.')
                {
                    a.append('1');
                    i++;
                }
                else
                {
                    a.append('2');
                    i++;
                }
            }
        }
        System.out.println(a.toString());
    }
}
/*
Examples
inputCopy
.-.--
outputCopy
012
inputCopy
--.
outputCopy
20
inputCopy
-..-.--
outputCopy
1012
 
 */