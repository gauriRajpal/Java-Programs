import java.util.Scanner;


public class Pro_factorial_function {
    static int factorial(int n){
        if(n==0||n==1)
            return 1;
        else
            return n*factorial(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of which you want to find the factorial:");
        int x = sc.nextInt();
        System.out.println("The value of factorial x is: "+factorial(x));
    }
}
