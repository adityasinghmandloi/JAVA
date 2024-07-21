
class Circle {
    double x, y;
    double r;

    double circumference() {
        return 2 * 3.14 * r;
    }

    double area() {
        return 3.14 * r * r;
    }
}

public class Demoencapsuleation1 {
    public static void main(String args[]) {
        Circle c = new Circle();
        c.x = 1.0;
        c.y = 3.0;
        c.r = 7.0;
        System.out.println("Circumference of circle:" + c.circumference());
        System.out.println("\nArea of Circle:" + c.area());
    }
}