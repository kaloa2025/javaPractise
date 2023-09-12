package Overloading;

public class OL_test {
    public static void main(String[] args)
    {
        OL_area a=new OL_area(10, 20);
        System.out.println(a.getcircle());
        System.out.println(a.getsquare());
        System.out.println(a.getrectangle());
    }
}
