class Circle{
    double x, y;
    double r;
    double circumference(){
        return 2*3.14*r;
    }
    double area(){
        return 3.14*r*r;
    }
}

class Box{
    double width;
    double height;
    double depth;
    double Area(){
        double a;
        a = 2*(height*width + height*depth + depth*width);
        return a;
    }
    double Volume(){
        double v;
        v = height*width*depth;
        return v;
    }
}

class Demoencapsuleation2{
    public static void main(String args[]){
        Circle c= new Circle();
        c.x=1.0;
        c.y=3.0;
        c.r=7.0;
        System.out.println("Circumference of circle:" + c.circumference());
        System.out.println("\nArea of Circle:" + c.area());
        Box b= new Box();
        b.height=4.0;
        b.width=3.0;
        b.depth=1.0;
        System.out.println("\nArea of box:" + b.Area());
        System.out.println("\nVolume of box:" + b.Volume());
        
        
    }
}