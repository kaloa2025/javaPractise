package Generic;

public class Test {
    public static void main(String[] args) {
        Data<String,String> d=new Data<String,String>();
        d.setT("AALOK");
        d.setV("Yash");
        Data<Integer,String> d1=new Data<Integer,String>();
        d1.setT(123);
        d1.setV("Namess");
        System.out.println(d.getT()+" "+d.getV());
        System.out.println(d1.getT()+" "+d1.getV());
    }
}
