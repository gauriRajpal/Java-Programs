public class Pro_fibonacci_recursion {
    static int fib(int n){
        if(n==1)
            return 0;
        else if(n==2)
            return 1;
        else return fib(n-1)+fib(n-2);    
    }

    public static void main(String[] args){
        int result = fib(4);
        System.out.println("The number at the given position is: "+result);
    }
}
