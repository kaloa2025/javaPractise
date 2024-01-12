package Codeforces;
/*
It seems like the year of 2013 came only yesterday. Do you know a curious fact? The year of 2013 is the first year after the old 1987 with only 
distinct digits.
Now you are suggested to solve the following problem: given a year number, find the minimum year number which is strictly larger than the given 
one and has only distinct digits.

Input
The single line contains integer y (1000 ≤ y ≤ 9000) — the year number.
Output
Print a single integer — the minimum year number that is strictly larger than y and all it's digits are distinct. It is guaranteed that the 
answer exists.

Examples
inputCopy
1987
outputCopy
2013
inputCopy
2013
outputCopy
2014
 */
import java.util.*;
public class Beautiful_Year {
    public static boolean hasduplicates(int i)
    {
        ArrayList<Integer> a=new ArrayList<>();
        while(i>0)
        {
            a.add(i%10);
            i=i/10;
        }
        for(int j=0;j<a.size();j++)
        {
            for(int k=0;k<a.size();k++)
            {
                if(j!=k && a.get(j)==a.get(k))
                {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n+1;i<9000000;i++)
        {
            if(hasduplicates(i))
            {
               System.out.println(i);
               break;
            }
            else
            {
                //conntinue
            }
        }
    }
    
}
