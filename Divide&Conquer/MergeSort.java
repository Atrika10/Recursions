public class MergeSort {
    public static void printArray(int arr[]){
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    public static void merge(int arr[], int si, int ei, int mid){
        int temp[] = new int[ei-si+1];  // storing elements while sorting using 2 pointers approach
        int i = si;     // iterator for left part
        int j = mid+1;  // iterator for right part
        int k =0;       // iterator for temp array

        while (i<=mid && j<=ei) {
            if (arr[i] < arr[j]) {  // if left part's element is smaller then store this element in temp array
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // rest element of left part
        while (i<= mid) {
            temp[k++] = arr[i++];
        }
        // rest element of right part
        while (j<= ei) {
            temp[k++] = arr[j++];
        }

        // copy all elements from temp array to original array
        for (k = 0, i=si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }

    }
    // Time complexity => O(nlogn) where n is the size of length of given array
    public static void mergesort(int arr[], int si, int ei){
        // base case
        // only 1 element will left or starting index will greater than ending index(invalid case)
        if(si >= ei){
            return;
        }

        // work
        // Step - 1 Divide
        int mid = (si + (ei -si)/2);

        // step - 2 sort left part & right part by calling recursive function
        mergesort(arr, si, mid);    // left part
        mergesort(arr, mid+1, ei);  // right part
        //step - 3 Merge
        merge(arr, si, ei, mid);
    }
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8};
        printArray(arr);
        mergesort(arr, 0, arr.length-1);
        printArray(arr);
    }
}
