package zCF;
/*
Capitalization is writing a word with its first letter as a capital letter. 
Your task is to capitalize the given word.
Note, that during capitalization all the letters except the first one remains unchanged.
Input
A single line contains a non-empty word. This word consists of lowercase and uppercase English letters. 
The length of the word will not exceed 103.
Output
Output the given word after capitalization.
 */
import java.util.*;
public class Cap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String a=String.valueOf(s.charAt(0));
        String b=a.toUpperCase();
        System.out.println(s.replaceFirst(a, b));
    }
}
