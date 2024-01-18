public class ReverseArray {
    
    // Time & Space Complexity of this code is O(n), where n is the size of length of the array
    
    public static int[] revArray(int arr[], int newArr[], int n, int i){

        // base case
        if(n == -1){
            return newArr;
        }
        // work
        newArr[i] = arr[n]; 

        // inner call
       return revArray(arr, newArr, n-1, i+1);
    }
    public static void main(String[] args) {
        int arr[] = {2,4,6,8};
        int n =arr.length;
        int newArr[] = new int[n];
        // call
        revArray(arr, newArr, n-1, 0);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
