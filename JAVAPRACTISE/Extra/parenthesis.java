package Extra;

    class parenthesis {
        public boolean isValid(String s) {
        
            char s1[]=s.toCharArray();
            for(int i=0;i<s1.length;i++)
            {
                if(s1[i]=='(')
                {
                    s1[i]='1';
                }
                if(s1[i]==')')
                {
                    s1[i]='4';
                }
                if(s1[i]=='[')
                {
                    s1[i]='2';
                }
                if(s1[i]==']')
                {
                    s1[i]='3';
                }
                if(s1[i]=='{')
                {
                    s1[i]='0';
                }
                if(s1[i]=='}')
                {
                    s1[i]='5';
                }
            }
            String s2=new String(s1);

            int arr[]=new int[s2.length()];
            for(int i=0; i<s2.length(); i++) 
            {
                arr[i] = Integer.parseInt(String.valueOf(s2.charAt(i)));
            }
            int count=0;
            for(int i=0;i<arr.length-1;i++)
            {
                if(arr.length%2!=0)
                {
                    count=0;
                    break;
                }
                else
                {
                    if(arr[i]<arr[i+1] && arr[i]+arr[i+1]==5 && arr[i]<6)
                    {
                    System.out.println("Loop1  "+i+(i+1));
                    arr[i+1]=10;
                    count++;
                    i++;
                }
                else
                {
                    for(int j=i+1;j<arr.length;j++)
                    {
                        if(arr[i]+arr[j]==5 && arr[i]<arr[j] && arr[i]<6)
                        {
                            System.out.println("Loop2  "+i+j);
                            arr[j]=10;
                            count++;
                            break;
                        }
                        else
                        {
                            if(arr[i]>6)
                            {
                                i++;
                            }
                            else
                            {
                                System.out.println("Skip  "+i+j);
                                count=0;
                            }
                        } 
                    }
                    if(count==0)
                    {
                        break;
                    }
                }
                }
            }

            if(count>0)
            {return true;}
            else
            {return false;}
            
        }
        public static void main(String[] args)
        {
            parenthesis p=new parenthesis();
            System.out.println(p.isValid("(([]){})"));
        }
    }
