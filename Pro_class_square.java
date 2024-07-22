import java.util.Scanner;

class Square{
    float side;
    public float sides(){
        return side;
    }
    public float area(){
        return side*side;
    }
    public float perimeter(){
        return 4*side;
    }
}
public class Pro_class_square {
    public static void main(String[] args) {
        Square one = new Square();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side of the square:");
        one.side = sc.nextFloat();
        System.out.println("The side of the sqaure is:"+ one.sides());
        System.out.println("The area of the sqaure is:"+ one.area());
        System.out.println("The perimeter of the square is:"+ one.perimeter());
    }
}
