import java.util.*;
import java.io.*;
public class First {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Non-Terminals");
        int n=sc.nextInt();
        System.out.println("Enter Non-Terminals");
        char[] nonterminal=new char[n];
        for(int i=0;i<n;i++)
        {
            nonterminal[i]=sc.next().charAt(0);
        }
        ArrayList<String> rule=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Production rule for "+ nonterminal[i]);
            String s=sc.next();
            rule.add(s);
        }
        ArrayList<String> first=new ArrayList<>();
        for(int i=n-1;i>=0;i--)//to iterate through rules
        {
            String str=rule.get(i);
            StringBuilder sb=new StringBuilder();
            sb.append("{");
            String[] s = str.split("|");
            for(int j=0;j<s.length;j++) //to iterate through different splitted rule
            {                
                for(int k=0;k<s[j].length();k++) //to iterate between splitted rule
                {
                    if(s[j].charAt(k)>='a'&&s[j].charAt(k)<='z') //nonterminal
                    {
                        sb.append(s[j].charAt(k));
                        sb.append(" ");
                    }
                    else if(s[j].charAt(k)=='$')//epsilon
                    {
                        sb.append(s[j].charAt(k));
                        sb.append(" ");
                    }
                    else//terminal
                    {
                        
                    }
                }
            }
            sb.append("}");
            first.add(sb.toString());
        }
        
        String str=rule.get(0);
        StringBuilder sb=new StringBuilder();
        sb.append("{");
        String[] s = str.split("|");
        for(int i=0;i<s.length;i++)
        {
            for(int j=0;j<s[i].length();j++)
            {
                if(s[i].charAt(j)>='A'&&s[i].charAt(j)<='Z')
                {

                }
            }
        }

        int j=first.size()-1;
        for(int i=0;i<n;i++)
        {
            System.out.println(nonterminal[i]+" "+first.get(j));
            j--;
        }
    }
}