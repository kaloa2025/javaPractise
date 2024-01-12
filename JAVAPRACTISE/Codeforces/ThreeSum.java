package Codeforces;

import java.util.*;
public class ThreeSum {
        public static List<List<Integer>> threeSum(int[] n) {
            ArrayList<Integer> l=new ArrayList<Integer>();
            List<List<Integer>> a=new ArrayList<List<Integer>>();
            for(int i=0;i<n.length;i++)
            {
                for(int j=0;j<n.length;j++)
                {
                    for(int k=0;k<n.length;k++)
                    {
                        if(i!=j&&j!=k&&i!=k&&(n[i]+n[j]+n[k]==0))
                        {
                            l.add(n[i]);
                            l.add(n[j]);
                            l.add(n[k]);
                            a.add(l);
                        }
                        l.clear();
                    }
                }
                
            }
            return a;
        }
    public static void main(String[] args) {
        int[] n={-1,0,1,-1,-4};
        System.out.println(threeSum(n));
    }
}
