import java.util.Scanner;

public class Pro_pattern_recursion {
    static void pattern(int n){
        if(n>0){
            for(int i=n;i>0;i--)
            System.out.print("*");
            System.out.println();
            pattern(n-1);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines you want to print in pattern:");
        int x = sc.nextInt();
        pattern(x);
    }
}
