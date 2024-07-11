import java.util.Scanner;

public class Pro_to_check_website{
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String web = sc.next();
        if(web.endsWith(".com"))
           System.out.println("It is a commercial website.");
        else if(web.endsWith(".org"))
           System.out.println("It is a organisational website.");
        else if(web.endsWith(".in"))
           System.out.println("This is an Indian website.");
        else    
        System.out.println("Please write correct website.");    
    }
}