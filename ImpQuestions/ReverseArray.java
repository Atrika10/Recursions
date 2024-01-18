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
    
    // Time Complexity of this code is O(n), where n is the size of length of the array
    // & Space Complexity is O(1) as we've not taken any extra space

    public static int[] revArrayOptimize(int arr[], int n, int i){
        // i => pointing element from front
        // n => pointing element from back
        // base case
        if(n <= i){       // when i & n meet any point or i becomes greater than n; it means all elements have been swaped
            return arr;
        }
        // work => Swap
        int temp = arr[n];
        arr[n] = arr[i];
        arr[i] = temp;
        // inner call
        return revArrayOptimize(arr, n-1, i+1);     // whatever the next call return, I'll return it from where I've called
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3, 4, 5, 6,7};
        int n =arr.length;
        // call
        revArrayOptimize(arr, n-1, 0);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
