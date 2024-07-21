import java.util.*;

public class Simpleinterest {
    public static void main(String[] args) {
        int  p, r, t;
        float s;
        
        Scanner sc=  new Scanner(System.in);
        p=sc.nextInt();
        r=sc.nextInt();
        t=sc.nextInt();
        s=(p*r*t)/100.0f;
        System.out.println(" Result Simple Interest: " + s);



    }
}
