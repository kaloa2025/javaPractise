import java.util.ArrayList;
public class SP2_1 {
    public static void main(String[] args) {
        int[] a={1,2,2,2,3,4,4,5,6};
        int[] b={1,1,2,2,2,3,3,4,5};
        ArrayList<Integer> l=new ArrayList<>();
        int i=0,j=0;
        while(i<a.length&&j<b.length)        
        {
            if(a[i]==b[j])
            {
                l.add(a[i]);
                i++;
                j++;
            }
            else if(a[i]<b[j])
            {
                i++;
            }
            else
            {
                j++;
            }
        }
        System.out.println(l.toString());
    }
}
