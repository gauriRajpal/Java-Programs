import java.util.Scanner;

public class Pro_factorial_recusion {
    static int fact(int n){
        int pro = 1;
        for(int i = n;i>0;i--){
            pro*=i;
        }
        return pro;
    }
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number of which you want to find the factorial:");
       int x = sc.nextInt();
       System.out.println("The value of the factorial x is: "+fact(x)); 
    }
}
