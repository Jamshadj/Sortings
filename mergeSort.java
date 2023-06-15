import java.util.Arrays;

public class mergeSort {
    public static void sort(int[] arr, int start, int end) {
        if (start < end) {
            int mid = start + (end - start) / 2;
            sort(arr, start, mid);
            sort(arr, mid + 1, end);
            merge(arr, start, mid, end);
        }
    }

    public static void merge(int[] arr, int start, int mid, int end) {
        int n1 = mid - start + 1;
        int n2 = end - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; i++) {
            leftArr[i] = arr[start + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArr[j] = arr[mid + j + 1];
        }
        int i = 0, j = 0, k = start;
        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }
        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }
        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }
    public static void main(String[] args) {
        int[] arr = {23, 4, 3, 43, 2, 3, 2, 1, 1, 3, 32};
        System.out.println(Arrays.toString(arr));
        mergeSort.sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }
}
