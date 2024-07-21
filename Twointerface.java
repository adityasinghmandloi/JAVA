import java.util.*;

interface Inner {
    void sum();
    void sub();
}

/**
 * Demo interface
 */
interface Demo {
    void div();
    void mul();
    //void sum();    
}

class Seven implements Inner, Demo {
    public void sum() {
        System.out.println("Addition");
    } 
    
    public void sub() {
        System.out.println("Subtraction");
    } 
    
    public void mul() {
        System.out.println("Multiplication");
    } 
    
    public void div() {
        System.out.println("Division");
    }
}

public class Twointerface extends Seven{
    public static void main(String[] args) {
        Twointerface obj = new Twointerface();
        obj.sum();
        obj.sub();
        obj.mul();
        obj.div();     
    }
}

