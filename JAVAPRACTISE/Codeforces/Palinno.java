package Codeforces;
import java.util.*;

public class Palinno {
        public static int isPalindrome(long a) 
        {
            ArrayList<Long> l=new ArrayList<>();
            while(a>0)
            {
                l.add(a%10);
                a=a/10;
            }
            int j=l.size()-1;
            for(int i=0;i<l.size();i++)
            {
                if(l.get(i)!=l.get(j))
                    {
                        return 0;
                    }
                    j--;
            }
            return 1;
        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            long n=sc.nextLong();
            System.out.println(isPalindrome(n));
        }
    }

