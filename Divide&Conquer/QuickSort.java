public class QuickSort {
    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static int partition(int arr[], int si, int ei) {
        int i = si-1; // iterator for creating space for smaller element of pivot element
        int j = i + 1;
        int pivot = arr[ei];
        while (j < ei) {
            if (pivot >= arr[j] && j < ei) {
                // swap
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
            j++;
        }
        // j is in pivot index
        // swap
        i++;
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
        return i;
    }

    // Time Complexity => O(nlogn) in avg case & O(n^2) in worst case where the array is already sorted
    // where n is the size of length of given array

    public static void quicksort(int arr[], int si, int ei) {
        // base case
        if (si >= ei) {
            return;
        }
        // pivot index => last element
        int pivotIndex = partition(arr, si, ei);
        // sort left part
        quicksort(arr, si, pivotIndex - 1);
        // sort right part
        quicksort(arr, pivotIndex + 1, ei);
    }

    public static void main(String[] args) {
        int arr[] = { 6, 3, 9, 5, 2, 8 ,-5};
        printArray(arr);
        quicksort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
