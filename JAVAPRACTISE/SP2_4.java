import java.util.*;
public class SP2_4 {
    public static void main(String[] args) {
        String s="abbbba";
        int i=0,j=s.length()-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                System.out.println("False");
            }
            i++;
            j--;
        }
    }
}
