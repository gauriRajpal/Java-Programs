import java.util.Scanner;

class Rectangle{
    float length;
    float breadth;
    public float area(){
        return length*breadth;
    }
    public float perimeter(){
        return 2*(length+breadth);
    }
}

public class Pro_class_rectangle {
    public static void main(String[] args) {
        Rectangle one = new Rectangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length and breadth: ");
        one.length = sc.nextFloat();
        one.breadth = sc.nextFloat();
        System.out.println("The area of the ractangle is:"+ one.area());
        System.out.println("The perimeter of the rectangle is:" + one.perimeter());
    }
}
