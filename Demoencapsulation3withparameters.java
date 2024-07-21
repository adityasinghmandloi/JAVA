class Circle{
    double x, y;
    double r;
    double circumference(){
        return 2*3.14*r;
    }
    double area(){
        return 3.14*r*r;
    }
    void setCircle(double a, double b, double c){
        x=a;
        y=b;
        r=c;
    }
}


class Demoencapsuleation3withparameters{
    public static void main(String args[]){
        Circle c= new Circle();
        c.setCircle(2.0, 3.0, 4.0);
       
        System.out.println("Circumference of circle:" + c.circumference());
        System.out.println("\nArea of Circle:" + c.area());
      
        
    }
}