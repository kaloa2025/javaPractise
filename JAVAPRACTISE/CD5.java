import java.util.*;
public class CD5 {
    public static String[] input=new String[14];
    public static int l=0,t=0,gt=0,sd=1;
    public static ArrayList<Integer> location=new ArrayList<>();
    public static ArrayList<String> tac=new ArrayList<>();
    public static ArrayList<String> go_to=new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Taking input;
        for(int i=0;i<14;i++)
        {
            input[i]=sc.next();
        }
        //checking input line by line;
        for(int i=0;i<14;i++)
        {
            if(conatinsoperator(input[i])) // code containing operators
            {
                location.add(++l); //using temporary variable
                StringBuilder sb=new StringBuilder();
                sb.append("T");
                sb.append(t);
                sb.append(input[i].substring(1, 5));
                tac.add(sb.toString());
                go_to.add(" ");

                location.add(++l); //assigning value
                StringBuilder sb2=new StringBuilder();
                sb2.append(input[i].substring(0, 2));
                sb2.append("T");
                sb2.append(t++);
                tac.add(sb2.toString());
                StringBuilder sb3=new StringBuilder();
                sb3.append("ends");
                sb3.append(sd++);
                go_to.add(sb3.toString());
            }
            else if(conatinscondition(input[i])!=0) //conditional statements-if, while
            {
                if(conatinscondition(input[i])==3)//while
                {
                    location.add(++l);
                    StringBuilder sb2=new StringBuilder();
                    sb2.append("if");
                    sb2.append(input[i].substring(5,11));
                    tac.add(sb2.toString());
                    go_to.add("while");
                }
                else //if
                {
                    location.add(++l); //adds for if
                    tac.add(input[i]);
                    go_to.add("do");

                    location.add(++l); //adds for else
                    tac.add("else");
                    go_to.add("else");
                }
            }
            else if(input[i].contains("{") || input[i].contains("}") || input[i].contains("do") || input[i].contains("else"))
            {
                //skips extra code lines
            }
            else
            {
                if(location.size()==0)
                {
                    location.add(l);
                    tac.add(input[i]);
                    go_to.add(" ");
                }
                else
                {
                    location.add(++l);
                    tac.add(input[i]);
                    go_to.add(" ");
                }
            }
        }
        //update goto
        ifgoto();
        elsegoto();
        successfulldo();
        insuccessfullwhile();
        //printing output
        System.out.println();
        System.out.println("OUTPUT - Aalok");
        System.out.println();
        displayOutput();
    }    

    public static boolean conatinsoperator(String s) //finds operator
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='+'||s.charAt(i)=='*')
            {
                return true;
            }
        }
        return false;
    }

    public static int conatinscondition(String s) //finds condition
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.contains("if"))
            {
                return 1;
            }
            if(s.contains("while"))
            {
                return 3;
            }
        }
        return 0;
    }
    public static void displayOutput() //displays output
    {
        for(int i=0;i<location.size();i++)
        {
            System.out.print(location.get(i)+" "+"|"+" ");
            System.out.print(tac.get(i)+"    ");
            System.out.print(go_to.get(i));
            System.out.println();
        }
    }

    public static int findintialif() 
    {
        for(int i=0;i<tac.size();i++)
        {
            if(tac.get(i).contains("if"))
            {
                return i;
            }
        }
        return 0;
    }
    public static int findelse()
    {
        for(int i=0;i<tac.size();i++)
        {
            if(tac.get(i).contains("else"))
            {
                return ++i;
            }
        }
        return 0;
    }
    public static void successfulldo()
    {
        for(int i=0;i<go_to.size();i++)
        {
            if(go_to.get(i).contains("ends"))
            {
                int index=0;
                for(int j=0;j<go_to.size();j++)
                {
                    if(go_to.get(j).contains("while"))
                    {
                        index=j;
                        StringBuilder sb=new StringBuilder();
                        sb.append("Goto: ");
                        sb.append(index);
                        go_to.set(i,sb.toString());
                        break;
                    }
                }  
            }
        }
    }
    public static void ifgoto()
    {
        for(int i=0;i<go_to.size();i++)
        {
            if(go_to.get(i).contains("do"))
            {
                int index=0;
                for(int j=0;j<go_to.size();j++)
                {
                    if(go_to.get(j).contains("1"))
                    {
                        index=j;
                        StringBuilder sb=new StringBuilder();
                        sb.append("Goto: ");
                        sb.append(--index);
                        go_to.set(i,sb.toString());
                        break;
                    }
                }  
            }
        }
    }
    public static void elsegoto()
    {
        for(int i=0;i<go_to.size();i++)
        {
            if(go_to.get(i).contains("else"))
            {
                int index=0;
                for(int j=0;j<go_to.size();j++)
                {
                    if(go_to.get(j).contains("2"))
                    {
                        index=j;
                        StringBuilder sb=new StringBuilder();
                        sb.append("Goto: ");
                        sb.append(--index);
                        go_to.set(i,sb.toString());
                        break;
                    }
                }  
            }
        }
    }
    public static void insuccessfullwhile()
    {
        for(int i=0;i<go_to.size();i++)
        {
            if(go_to.get(i).contains("while"))
            {
                int index=0;
                for(int j=0;j<tac.size();j++)
                {
                    if(tac.get(j).contains("if"))
                    {
                        index=j;
                        StringBuilder sb=new StringBuilder();
                        sb.append("Goto: ");
                        sb.append(index);
                        go_to.set(i,sb.toString());
                        break;
                    }
                }  
            }
        }        
    }
}