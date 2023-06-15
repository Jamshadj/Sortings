import java.util.Arrays;

/**
 * quickSort
 */
public class quickSort {

    public static int[] sort(int[] arr) {
        sortHelper(arr, 0, arr.length - 1);
        return arr;
    }

    public static void sortHelper(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIdx = sorting(arr, left, right);
            sortHelper(arr, left, pivotIdx - 1);
            sortHelper(arr, pivotIdx + 1, right);
        }
    }

    public static int sorting(int[] arr, int left, int right) {
        int pivot = arr[left];
        int i = left + 1;
        int j = right;
        while (i <= j) {
            while (i <= right && arr[i] <= pivot) {
                i++;
            }
            while (j >= left && arr[j] > pivot) {
                j--;
            }
            if (i <=j) {
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        int temp = arr[j];
        arr[j] = arr[left];
        arr[left] = temp;
        return j;
    }

    public static void main(String[] args) {
        int arr[] = { 3, 23, 42, 43, 4, 3, 31, 321, 2 };
        System.out.println(Arrays.toString(sort(arr)));
    }

}
 