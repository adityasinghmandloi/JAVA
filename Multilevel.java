import java.util.Scanner;

class Test{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

class Test2 extends Test{

    // static keyword then  no need to create object for it
    public static int mul(int a, int b){
        return a*b;
    }
    public int div(int a, int b){
        return a/b;
    }

}

public class Multilevel extends Test2{

    public static void main(String[] args) {
        int p, q;
        Multilevel ml= new Multilevel();
        Scanner sc= new Scanner(System.in);
        p=sc.nextInt();
        q=sc.nextInt();
        System.out.println("Addition: "+ ml.add(p, q));
        System.out.println("Subtraction: "+ ml.sub(p, q));
        System.out.println("Multiplication: "+ mul(p, q));
        System.out.println("Division: "+ ml.div(p, q));
    }

}
