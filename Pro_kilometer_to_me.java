import java.util.Scanner;
public class Pro_kilometer_to_me {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance in kilometer:");
        double a = sc.nextDouble();
        double miles = a*0.627371;
        System.out.println("The distance in miles is :"+miles);
    }
}
