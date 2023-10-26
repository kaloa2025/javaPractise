package LambdaExpression;

public class Z03Analyzer {
    public static void searchArr(String[] strList, String searchStr, Analyzer analyzer)
    {
        for(String currentStr:strList)
        {
            if(analyzer.analyze(currentStr,searchStr))
            {
                System.out.println("Match: "+currentStr);
            }
        }
    } 
}
