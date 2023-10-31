package Generic;

public class Test {
    public static void main(String[] args) {
        Data<String> d=new Data<String>();
        d.setT("AALOK");
        Data<Integer> d1=new Data<Integer>();
        d1.setT(123);
        System.out.println(d.getT());
        System.out.println(d1.getT());
    }
}
