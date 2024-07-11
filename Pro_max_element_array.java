public class Pro_max_element_array{
    public void main(String[] args){
        int[] arr = {1,21,3,45,34,6};
        int max = 0;
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i])
            max = arr[i];
        }
            System.out.println("The maximum element in the array is:" + max);
        
    }
}