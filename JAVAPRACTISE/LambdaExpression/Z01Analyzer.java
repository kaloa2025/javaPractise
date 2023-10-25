package LambdaExpression;

public class Z01Analyzer {
    public static void main(String[] args) {
        String[] str={"tommorrow","todo","to","timbaktoo","the"};
        String searchString="to";
        System.out.println("Searching for : "+searchString);

        // AnalyzerTool analyzerTool=new AnalyzerTool();

        // for(String currentStr:str)
        // {
        //     if(analyzerTool.arrContains(currentStr, searchString))
        //     {
        //         System.out.println(currentStr);
        //     }
        // }
        
        ContainsAnalyzer contains=new ContainsAnalyzer();
        
        for(String currentStr:str)
        {
            if(contains.analyze(currentStr, searchString))
            {
                System.out.println(currentStr);
            }
        }

    }        
}
//functional interface - contains only one abstract public method;
//marker interface -empty interface;