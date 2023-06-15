import java.util.Arrays;

/**
 * insertionSort
 */
public class insertionSort {

public static int [] sort(int [] arr){
    for (int i = 1; i < arr.length; i++) {
        int temp=arr[i];
        int j=i-1;
        while (j>=0 && arr[j]>temp) {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=temp;
    }
    return arr;
}

    public static void main(String[] args) {
        int [] arr={3434,34,3,2,4,342,43,1 };
        int [] result=sort(arr);
        Arrays.stream(result).forEach(System.out::println);
    }
}