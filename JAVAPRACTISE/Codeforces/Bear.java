package Codeforces;
import java.util.*;
/*
Bear Limak wants to become the largest of bears, or at least to become larger than his brother Bob.
Right now, Limak and Bob weigh a and b respectively. It's guaranteed that Limak's weight is smaller than or 
equal to his brother's weight.
Limak eats a lot and his weight is tripled after every year, while Bob's weight is doubled after every year.
After how many full years will Limak become strictly larger (strictly heavier) than Bob?
Input
The only line of the input contains two integers a and b (1 ≤ a ≤ b ≤ 10) — the weight of Limak and the weight
of Bob respectively.
Output
Print one integer, denoting the integer number of years after which Limak will become strictly larger than Bob.
Examples
inputCopy
4 7
outputCopy
2
 */
public class Bear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int count=0;
        while(b>a)
        {
            a=3*a;
            b=2*b;
            count++;
        }
        if(a>b){System.out.println(count);}
        else{System.out.println(count+1);}
    }    
}