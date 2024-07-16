import java.util.Scanner;

public class Pro_multipliaction_table_function {
    static void multiplication(int n){
        System.out.println("The multiplication table is:");
        for(int i = 1;i<=10;i++){
            System.out.format("%dX%d=%d\n",n,i,n*i);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number whose multiplication table you want:");
        int x = sc.nextInt();
        multiplication(x);
    }
}
