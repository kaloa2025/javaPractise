import java.util.*;
public class VIPCAFE {
    public static int Findmax(int[] a)
    {
        return 0;
        
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();//total orders
        int[] a=new int[n];//array of prioritys
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int k=sc.nextInt();//friends position
        while(true)
        {
            int max=0,index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {max=a[i];index=i;}
        }
            if(index==k){System.out.println(1);}
            else
            {
                System.out.println(k++);
            }
        }
    }    
}
