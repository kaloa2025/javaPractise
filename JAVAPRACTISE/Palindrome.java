
public class Palindrome {
    public boolean isPalindrome(int x) {
        String n = Integer.toString(x);
        int y=n.length();
        int count =0;

        char s1[]=new char[y];
        char s2[]=new char[y];

        for (int i = 0; i < y; i++) 
        {
            s1[i] = n.charAt(i);
        }
        for(int i=0;i<y;i++)
        {
            s2[i] = n.charAt(y-i-1);
        }
        for(int i=0;i<y;i++)
        {
            if(s1[i]==s2[i])
            {
                count++;
            }
            else
            {
                count=0;
                break;
            }
        }
        if(count>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String[] args)
    {
        Palindrome p=new Palindrome();
        System.out.println(p.isPalindrome(121));
    }
}