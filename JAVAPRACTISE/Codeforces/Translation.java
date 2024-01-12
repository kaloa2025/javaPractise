package Codeforces;
/*
The translation from the Berland language into the Birland language is not an easy task. Those languages 
are very similar: a berlandish word differs from a birlandish word with the same meaning a little: it is 
spelled (and pronounced) reversely. For example, a Berlandish word code corresponds to a Birlandish word 
edoc. However, it's easy to make a mistake during the «translation». Vasya translated word s from 
Berlandish into Birlandish as t. Help him: find out if he translated the word correctly.
Input
The first line contains word s, the second line contains word t. The words consist of lowercase Latin 
letters. The input data do not consist unnecessary spaces. The words are not empty and their lengths do not
exceed 100 symbols.
Output
If the word t is a word s, written reversely, print YES, otherwise print NO.

code  abb code
edoc  aba code

YES   NO   No

 */
import java.util.*;
public class Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String t=sc.next();
        int count=0;
        if(s.length()!=t.length())
        {
            System.out.println("NO");
        }
        else
        {
            for(int i=0;i<s.length();i++)
            {
                if(s.charAt(i)==t.charAt(t.length()-i-1))
                {
                    count++;
                }
            }
            if(count==s.length())
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        }
    }
}
