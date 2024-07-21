import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        int num;
        Scanner sc= new Scanner(System.in);
        num= sc.nextInt();
        System.out.println(" Table of "+ num + " is :");
        for(int i=1; i<=10; i++){
            int a= num*i;
            System.out.println(num+"*"+i + "=" + a);
        }
    }

}
