package Abstraction;

public abstract class Display {
    public void show()
    {
        System.out.println("NonAbst");
    }
    public abstract void data();
    
}

//abstarct class not must abstract method
//abstract method must abstract class
//if child class of abastract class necessary to override abstarct method for extending 