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
    
    Circle(double c){
        x=0;
        y=0;
        r=c;
    }
    
    Circle(Circle c){
        x=c.x;
        y=c.y;
        r=c.r;
    }
    Circle(){
        x=1.0;
        y=2.0;
        r=3.0;
    }
}


class Demoencapsulation4constructoroverloading{
    public static void main(String args[]){
        Circle c1 = new Circle(2.0,3.0,4.0);
        Circle c2 = new Circle(-2.0,8.0,4.0);
        Circle c3= new Circle(4.0);
        Circle c4= new Circle(-8.0);
        Circle c5= new Circle(c1);
        Circle c6= new Circle();
        
       
        System.out.println("Circumference of circle:" + c1.circumference());
        System.out.println("\nArea of Circle:" + c1.area());
        
        System.out.println("Circumference of circle:" + c2.circumference());
        System.out.println("\nArea of Circle:" +c2.area());
        
        System.out.println("Circumference of circle:"+c3.circumference());
        System.out.println("\nArea of Circle:" +c3.area());
        
        System.out.println("Circumference of circle:" +c4.circumference());
        System.out.println("\nArea of Circle:" +c4.area());
        
        System.out.println("Circumference of circle:" +c5.circumference());
        System.out.println("\nArea of Circle:" +c5.area());
        
        System.out.println("Circumference of circle:" +c6.circumference());
        System.out.println("\nArea of Circle:" +c6.area());
      
        
    }
}