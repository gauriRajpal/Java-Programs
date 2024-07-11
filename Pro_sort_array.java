public class Pro_sort_array {
    public void main(String[] args){
        int[] arr = {1,21,3,45,34,56,67};
        int sort;
        for(int i = 0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                sort = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = sort;
            }
        }
        for(int i =0;i<arr.length-1;i++)
        System.out.println(arr[i]);
    }
}
