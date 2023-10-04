package Nested;

public class Outer {
    class Inner{
        public void m()
        {
            System.out.println("Hello");
        }
    }
    class middle{
        public void m()
        {
            System.out.println("Hello");
        }
    }
    public void ano()
    {
        System.out.println("Hello from ano");
    }
    
}

//nested class -> Inner classes : Member class 
//                              : Local class  
//                              : Anonymous class
//             -> Static nested classes
//
//