package LambdaExpression;

public class ContainsAnalyzer implements Analyzer {

    @Override
    public boolean analyze(String sourceString,String searchStr) {
        return sourceString.contains(searchStr);
    }
    
}
