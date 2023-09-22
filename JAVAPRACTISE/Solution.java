public class Solution 
{
    public static int finalValueAfterOperations(String[] operations)
    {
        int x=0;
        for(int i=0;i<operations.length;i++)
        {
            if(operations[i]=="--X"||operations[i]=="X--")
            {
                x--;
            }
            if(operations[i]=="X++"||operations[i]=="++X")
            {
                x++;
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
/*Class Object directly or indirectly extends every class
it is overriden by 
@override
toString(): returns object representation in string
hashcode():returns unique identification number
equals() :compares objects refrence 
*/
