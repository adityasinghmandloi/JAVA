interface Inner{
    void sum();
    void sub();
}

public class seven implements Inner{
    public void sum(){
        System.out.println("Addition");
    } 
    public void sub(){
        System.out.println("Subtraction");
    } 
}



public class Interimp {
    public static void main(String[] args) {
        Interimp obj = new Interimp();

        obj.sub();
        
        
        
    }
    

}
