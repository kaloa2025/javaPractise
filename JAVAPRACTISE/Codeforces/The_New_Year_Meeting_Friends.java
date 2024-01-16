package Codeforces;
/*
There are three friend living on the straight line Ox in Lineland. The first friend lives at the point x1, the second friend lives at the point x2,
and the third friend lives at the point x3. They plan to celebrate the New Year together, so they need to meet at one point. What is the minimum
total distance they have to travel in order to meet at some point and celebrate the New Year?
It's guaranteed that the optimal answer is always integer.
*/
import java.util.*;
public class The_New_Year_Meeting_Friends {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        Arrays.sort(a);
        System.out.println(a[2]-a[1]+a[1]-a[0]);
    }
}
/*
 
Input
The first line of the input contains three distinct integers x1, x2 and x3 (1 ≤ x1, x2, x3 ≤ 100) — the coordinates of the houses of the first, 
the second and the third friends respectively.
Output
Print one integer — the minimum total distance the friends need to travel in order to meet together.

Examples
inputCopy
7 1 4
outputCopy
6
inputCopy
30 20 10
outputCopy
20
Note
In the first sample, friends should meet at the point 4. Thus, the first friend has to travel the distance of 3 (from the point 7 to the point 4),
the second friend also has to travel the distance of 3 (from the point 1 to the point 4), while the third friend should not go anywhere because he
lives at the point 4.
 
 */