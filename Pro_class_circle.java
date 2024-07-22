import java.util.Scanner;

class Circle{
    float radius;
    public double area(){
        double a = 3.14*radius*radius;
        return a;
    }
    public double perimeter(){
        double b = 2*3.14*radius;
        return b;
    }
}

public class Pro_class_circle {
    public static void main(String[] args) {
        Circle one = new Circle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        one.radius = sc.nextFloat();
        System.out.println("The area of the circle is :" + one.area());
        System.out.println("The perimeter of the circle is:" + one.perimeter());
    }
}
