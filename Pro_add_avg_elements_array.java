public class Pro_add_avg_elements_array {
    public void main(String[] args){
        float[] marks = {97.5f,89.5f,98.0f,56.5f,67.5f};
        // We have to write f because numbers are autometically taken as double in points.
        float sum = 0.0f;
        for(int i = 0;i<marks.length;i++){
            sum = sum+marks[i];
        }
        System.out.println("The sum of numbers is: "+sum);
        System.out.println("The average of the elements is:"+sum/marks.length);
    }
}
