import java.util.Scanner;

public class Pro_leap_year {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter a year:");
       int year = sc.nextInt();
       if(year%400==0)
         System.out.println("This is a leap year");
       else if(year%4==0 && year%100!=0)
         System.out.println("This is a leap year");
       else
         System.out.println("This is not a leap year");  
    }
}
