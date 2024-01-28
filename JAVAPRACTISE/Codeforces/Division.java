package Codeforces;
/*
Codeforces separates its users into 4 divisions by their rating:
For Division 1: 1900≤rating
For Division 2: 1600≤rating≤1899
For Division 3: 1400≤rating≤1599
For Division 4: rating≤1399
Given a rating , print in which division the rating belongs.
*/
import java.util.*;
public class Division {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int i=sc.nextInt();
            if(i<=1399){System.out.println("Division 4");}
            if(i<=1599&&i>=1400){System.out.println("Division 3");}
            if(i<=1899&&i>=1600){System.out.println("Division 2");}
            if(i>=1900){System.out.println("Division 1");}
            t--;
        }
    }
}
/*
 
Example
inputCopy
7
-789
1299
1300
1399
1400
1679
2300
outputCopy
Division 4
Division 4
Division 4
Division 4
Division 3
Division 2
Division 1
Note
For test cases 1−4
, the corresponding ratings are −789
, 1299
, 1300
, 1399
, so all of them are in division 4
.

For the fifth test case, the corresponding rating is 1400
, so it is in division 3
.

For the sixth test case, the corresponding rating is 1679
, so it is in division 2
.

For the seventh test case, the corresponding rating is 2300
, so it is in division 1
.
 
*/
