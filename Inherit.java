import java.util.Scanner;

class Test{
    public int add(int a, int b){
        return a+b;
    }
    public int sub(int a, int b){
        return a-b;
    }
}

public class Inherit extends Test{
    // code reusability
    // single, multiple, hierarchical, multilevl, hybrid
    public static void main(String []args){
        int a, b;
        Inherit obj= new Inherit();
        Scanner sc= new Scanner(System.in);
        a= sc.nextInt();
        b=sc.nextInt();
        System.out.println(obj.add(a, b));
        System.out.println(obj.sub(a, b));

    }

}
