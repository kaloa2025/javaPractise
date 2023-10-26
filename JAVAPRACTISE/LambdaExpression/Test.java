package LambdaExpression;

import packinterface.Arithmatic;

public class Test {
    public static void main(String[] args) {
        Arithmatic ar=(int a,int b)->System.out.println(a+b);
        ar.Sum(10, 12);
    }    
}
