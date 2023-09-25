public class stringdiff {
    public char findTheDifference(String s, String t) {
        String r=s.replace("t"," ");
        char a='\0';
        char[] ch=r.toCharArray(); 
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]!='\0')
            {
                a=ch[i];
            }
        }
        return a;
        }
    public static void main(String[] args)
    {
        stringdiff s=new stringdiff();
        System.out.println(s.findTheDifference("abcd", "abcde"));
    }
}