import java.util.Scanner;
public class Pro_add_3_num{
      public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int num1 = sc.nextInt();
        System.out.println("Enter the second number:");
        int num2 = sc.nextInt();
        System.out.println("Enter the third number:");
        int num3 = sc.nextInt();
        int sum =  num1+num2+num3;
        System.out.print("The sum of the three numbers is:");
        System.out.println(sum);
      }
}