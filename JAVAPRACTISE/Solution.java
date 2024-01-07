import java.util.*;
public class Solution {
    public static int minimumOperationsToMakeEqual(int x, int y) {
        int a=0;
        while(x!=y)
        {
            if(x>y)
            {
                if(x%11==0)
                {
                    x=x/11;
                }
                else if(x%5==0)
                {
                    x=x/5;
                }
                else
                {
                        x--;
                }
            }
            else
            {
                x++;
            }
            System.out.println(x+" "+y);
            a++;
        }
        return a;
    }
    public static void main(String[] args) {
        int x=54;
        int y=2;
        System.out.println(minimumOperationsToMakeEqual(x,y));
    }
}


/*
int count=0,sum=0,max=0;
        for(int i=0;i<a.length;i++)
        {
            
            for(int j=i;j<a.length-1;j++)
            {
                if(a[j+1]==a[j]+1)
                {
                    tempsum+=a[j];
                    count++;
                }
                else
                {
                    tempsum+=a[j];
                    count++;   
                    break;
                }
            }
            if(count>max)
            {
                sum=tempsum;
            }
        }
        int n=a.length;
        int y=sum;
        while(n>0)
        {
            int z=0;
            for(int i=0;i<a.length;i++)
            {
                if(a[i]==y+1)
                {
                    z++;
                    //continue;
                }
            }
            if(z>0)
            {
                n--;
                y++;
            }
            else
            {
                return y++;
            }
        }
        return sum;
 */