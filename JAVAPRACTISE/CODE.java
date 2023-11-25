import java.util.*;
public class CODE {
    public static int mbs(int n,int m,int[][] c,int[][] r)
    {
        int count=0;
        boolean[] bs=new boolean[m];

        Arrays.sort(c,(a,b)->Integer.compare(b[1],a[1]));
        Arrays.sort(r,Comparator.comparingInt((int[] a)->a[1]).thenComparingInt(a->-a[0]));

        for(int[] a:c)
        {
            for(int i=0;i<m;i++)
            {
                if(r[i][1]<=a[1] && r[i][0]>=a[0])
                {
                    count++;
                    bs[i]=true;
                    break;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//no of customers
        int m=sc.nextInt();//no of rice bags
        int[][] cp=new int[n][2];//a,b:customers quantity&cost
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<2;j++)
            {
                cp[i][j]=sc.nextInt();
            }
        }
        int[][] qc=new int[m][2];//p,q:bags quantity&cost
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<2;j++)
            {
                qc[i][j]=sc.nextInt();
            }
        }
        //price of bag <= custoem
        //qualit of bag >pref
        int r=mbs(n,m,cp,qc);
        System.out.println(r);
    }
    
}
