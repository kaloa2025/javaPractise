import java.util.*;
public class SP2_2 {
    public static void main(String[] args) {
        int a[]={2,3,7,10,12,15,30,34};
        int b[]={1,5,7,8,10,15,16,19};
        int i=0,j=0;
        int sum1=0,sum2=0,total=0;

        while(i<a.length&&j<b.length)
        {
            if(a[i]==b[j])
            {
                total+=Math.max(sum1,sum2)+a[i];
                sum1=0;
                sum2=0;
                i++;
                j++;
            }
            else if(a[i]>b[j])
            {
                sum2+=b[j];
                j++;
            }
            else
            {
                sum1+=a[i];
                i++;
            }
        }
        while(i<a.length)
        {
            sum1+=a[i];
            i++;
        }
        while(j<b.length)
        {
            sum2+=b[j];
            j++;
        }
        total+=Math.max(sum1,sum2);
        System.out.println(total);
    }
}
