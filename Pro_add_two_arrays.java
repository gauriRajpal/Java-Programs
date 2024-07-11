public class Pro_add_two_arrays {
    public void main(String[] args){
        int[][] a1 = {{1,2,3},{4,5,6}};
        int[][] a2 = {{2,6,13},{3,7,1}};
        int[][] result = {{0,0,0},{0,0,0}};
        System.out.println("The sum is:");
        for(int i = 0;i<a1.length;i++){
            for(int j = 0;j<a2.length;j++){
                result[i][j]= a1[i][j] + a2[i][j];
                System.out.print(result[i][j] +" ");
            }
            System.out.println("");
        }
    }
}
