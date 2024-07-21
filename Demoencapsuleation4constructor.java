class Circle{
    double x, y;
    double r;
    double circumference(){
        return 2*3.14*r;
    }
    double area(){
        return 3.14*r*r;
    }
    Circle(double a, double b, double c){
        x=a;
        y=b;
        r=c;
    }
}


class Demoencapsuleation4constructor{
    public static void main(String args[]){
        Circle c1 = new Circle(2.0,3.0,4.0);
        Circle c2 = new Circle(-2.0,8.0,4.0);
        
       
        System.out.println("Circumference of circle:" + c1.circumference());
        System.out.println("\nArea of Circle:" + c1.area());
      
        
    }
}