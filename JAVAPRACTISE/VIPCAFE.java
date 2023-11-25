import java.util.*;
public class VIPCAFE {
    public static int Findmax(int[] a)
    {
        int max=0,index=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {max=a[i];index=i;}
        }
        return index+1;
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
            int maxi=Findmax(a);
            if(maxi==k){System.out.println(1);}
            else
            {
                System.out.println(k++);
            }
        }
    }    
}
