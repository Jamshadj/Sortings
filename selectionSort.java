import java.util.Arrays;

public class selectionSort {
    
        public static int [] sort(int [] arr){
            for (int i = 0; i < arr.length; i++) {
                int idx=i;
                for (int j = i+1; j < arr.length; j++) {
                    if (arr[j]<arr[idx]) {
                        idx=j;
                    }
                }
                int temp=arr[i];
                arr[i]=arr[idx];
                arr[idx]=temp;
            }
            return arr;
             
        }
        

    public static void main(String[] args) { 
        int[] array = { 34,3,-3,-32,4,0};
        int[] result=sort(array);
        Arrays.stream(result).forEach(System.out::println);
    }
}
