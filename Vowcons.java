import java.util.*;

public class Vowcons {
    public static void main(String []args){
        char c;
        Vowcons vc= new Vowcons();
        // Without using static keyword it is required to create object to call it 
        vc.fung();
        vc.slen();

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter single charachter: ");
        c=sc.next().charAt(0);
        switch (c) {

            case 'A':
            case 'a':
            case 'E':
            case 'e':
            case 'I':
            case 'i':
            case 'O':
            case 'o':
            case 'U':
            case 'u':
            System.out.println("Vowel");
                break;
        
            default:
            System.out.println("Consonant");
                break;
        }
        //fung();
        void make(){
            int w=15;
            System.out.println("first class: " + w);
        }

        Second sa = new Second();
        sa.work();


    }
    static void fung(){
         //Scanner sc = new Scanner(System.in);
         //int a;
    //     //a= sc.next();
        System.out.println("I will be executed");
    //    // return 0;
     };
    void slen(){
        String s = "Welcome";  
        int c = 0;
        s=s+'\0';
    
        for(int i = 0; s.charAt(i) != '\0'; i++){
            c++;
        }

    
        System.out.println("Length of the string: " + c);
    }   

}
class Second{
    int a;
    void work(){
        a=16;
        System.out.println("second class: " + a);
    }
    Second sn= new Second();
    sn.make();

}
