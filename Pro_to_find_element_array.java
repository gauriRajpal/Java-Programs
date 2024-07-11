import java.util.Scanner;

public class Pro_to_find_element_array {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] myNum = {4,6,8,9};
        System.out.println("Enter the number you want to find in the array");
        int a = sc.nextInt();
        boolean isInArray = false;
        for(int element:myNum){
            if(a==element){
                isInArray = true;
                break;
            }
        }
        if(isInArray)
        System.out.println("The number is present.");
        else
        System.out.println("The number is not present.");
    }
}
