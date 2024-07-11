import java.util.Scanner;
public class Pro_percent_stu {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the marks in first subject:");
        int a = sc.nextInt();
        System.out.println("Enter the marks in second subject:");
        int b = sc.nextInt();
        System.out.println("Enter the marks in third subject:");
        int c = sc.nextInt();
        System.out.println("Enter the marks in fourth subject:");
        int d = sc.nextInt();
        System.out.println("Enter the marks in fifth subject:");
        int e = sc.nextInt();
        int sum = a+b+c+d+e;
        float per = sum/5;
        System.out.println("The percentage of the students is:");
        System.out.println(per);
    }
}
