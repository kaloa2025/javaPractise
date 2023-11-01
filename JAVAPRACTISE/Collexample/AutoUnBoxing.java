package Collexample;

public class AutoUnBoxing {
    public static void main(String[] args) {
        Integer intObject = new Integer(1);
        int intPrimitive = 2;
        Integer tempInteger;
        int tempPrimitive;
        tempInteger = new Integer(intPrimitive);
        tempPrimitive = intObject.intValue();
        tempInteger=intPrimitive;
        tempPrimitive=intObject;
        System.out.println(tempInteger);
        System.out.println(tempPrimitive);
    }    
}
