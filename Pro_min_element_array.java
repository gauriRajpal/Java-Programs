public class Pro_min_element_array {
    public void main(String[] args){
        int[] arr = {34,76,3,67,1,55,0,4};
        int min = Integer.MAX_VALUE;
        for(int i =0;i<arr.length;i++){
            if(min>arr[i])
            min = arr[i];
        }
        System.out.println("The minmum element of the array is "+ min);
    }
}
