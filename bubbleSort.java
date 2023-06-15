import java.util.Arrays;

/**
 * bubbleSort
 */
public class bubbleSort {

    public static int [] sort(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            for (int j = 0; j < array.length-1-i; j++) {
                if (array[j]>array[j+1]) {
                    int temp=array[j+1];
                    array[j+1]=array[j];
                    array[j]=temp;
                }
            }
        }
        return array;
    }
    
  public static void main(String[] args) {
    int arr[]={443,5,445,32,43,45,3,54,453,1};
    int [] result=sort(arr);
    Arrays.stream(result).forEach(System.out::println);
  }

}