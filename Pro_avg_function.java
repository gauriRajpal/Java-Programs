public class Pro_avg_function {
    static float avg(int ...arr){
        float sum = 0.0f;
        for(int i=0;i<arr.length;i++){
            sum=sum+arr[i];
        }
        float avge = sum/arr.length;
        return avge;
    }
    public static void main(String[] args){
        float set = avg(2,3,4,5);
        System.out.println("The average of the numbers is:"+ set);
    }
}
