import java.util.*;
public class SP2_3 {
    public static void main(String[] args) {
        int[][] a={{10,12,14,16},{11,15,17,19},{13,18,20,22},{21,25,29,30}};
        int i=0,j=3,x=21;
        // System.out.println(a[i][j]);
        while(i<4&&j>=0)
        {
            if(x>a[i][j])
            {
                i++;
                // System.out.println(a[i][j]);
            }
            else if(x<a[i][j])
            {
                j--;
                // System.out.println(a[i][j]);
            }
            else if(x==a[i][j])
            {
                System.out.println("found at "+i+" "+j);
                break;
            }
        }
    }
}
