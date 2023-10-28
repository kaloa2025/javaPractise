package LambdaExpression;

import packinterface.Arithmatic;

public class Test {
    public static void main(String[] args) {
        // Arithmatic ar=new Arithmatic() {
        //     public void sum(int a,int b)
        //     {
        //         System.out.println(a+b);
        //     }
        // };
        Arithmatic ar=(int a,int b)->System.out.println(a+b);
        ar.Sum(10, 12);
    }    
}
