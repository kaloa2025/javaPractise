package Extra;
public class BtoI {
    public static void main(String[] args) {
        String a="11";
        String b="1111";
        int a1=Integer.parseInt(a,2);
        int b1=Integer.parseInt(b,2);
        int c1=a1+b1;
        String s=Integer.toBinaryString(10);
        System.out.println(s);
    }    
}