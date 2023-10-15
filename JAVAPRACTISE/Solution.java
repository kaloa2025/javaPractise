public class Solution 
{
    public static int finalValueAfterOperations(String[] operations)
    {
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i]=="--X"||operations[i]=="X--")
            {
                x=x-1;
            }
            if(operations[i]=="X++"||operations[i]=="++X")
            {
                x=x+1;
            }
        }
        return x;
    }
    public static void main(String[] args)
    {
        String[] strAr1=new String[] {"--X", "X--", "X++"};
        System.out.println(finalValueAfterOperations(strAr1));
    }
}
// /*Class Object directly or indirectly extends every class
// it is overriden by 
// @override
// toString(): returns object representation in string
// hashcode():returns unique identification number
// equals() :compares objects refrence 
// */


// class Solution {
//     public boolean isIsomorphic(String s, String t) {
//         char[] ch1=s.toCharArray();
//         char[] ch2=t.toCharArray();
//         int[] a=new int[s.length()];
//         int[] b=new int[t.length()];
//         int count=0,k=0;
//         if(ch1.length!=ch2.length)
//         {
//             return false;
//         }
//         else
//         {
//             k=0;
//             for(int i=0;i<ch1.length;i++)
//             {
//                 count=0;
//                 for(int j=0;j<ch1.length;j++)
//                 {
//                     if(ch1[i]==ch1[j])
//                     {
//                         count++;
//                     }
//                     else
//                     {
//                         //continue
//                     }
//                 }
//                 a[i]=count;
//             }

//             for(int i=0;i<ch2.length;i++)
//             {
//                 count=0;
//                 for(int j=0;j<ch2.length;j++)
//                 {
//                     if(ch2[i]==ch2[j])
//                     {
//                         count++;
//                     }
//                     else
//                     {
//                         //continue
//                     }
//                 }
//                 b[i]=count;
//             }
//         }
//         for(int i=0;i<a.length;i++)
//         {
//             if(a[i]==b[i])
//             {
//                 k++;
//             }
//             else
//             {
//                 k=0;
//                 break;
//             }
//         }
//         if(k!=0)
//         {
//             return true;
//         }
//         else
//         {
//             return false;
//         }
//     }
//     public static void main(String[] args) {
//         Solution s=new Solution();
//         System.out.println(s.isIsomorphic("bbbaaaba", "aaabbbba"));
//     }
// }
