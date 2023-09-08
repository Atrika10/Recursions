public class Basics{
    // Calculate Factorial of n
    public static int factorial(int n){
        // base case
        if (n == 1) {
            return n;
        }
        // work
        int ans = n * factorial(n-1);
        return ans;
    }


    // calculate sum of n natural number using recursion in O(n) time & space complexity
    public static int sumOfNaturalNum(int n){
        // base case
        if (n == 1) {
            return 1;
        }

        // work
        int ans = n + sumOfNaturalNum(n-1);
        return ans;
    }

    // print nth fibonacci number
    // Time complexity => O(2^n) Expoenetial T.C & Space Complex. => O(n)
    public static int fibonacciNum(int n){
        // base case
        if (n == 0 || n == 1) {
            return n;
        }
        // work 
        int ans = fibonacciNum(n-1) + fibonacciNum(n-2);
        return ans;
    }

    // check a given array is sorted or not
    public static boolean isSorted(int n, int i, int arr[]){
        // base case
        if (i == n-1) { // I've checked all & now standing in the last index of the given array
            return true;
        }

        // work
        if (arr[i] > arr[i+1]) { 
            return false;
        }
        return isSorted(n, i+1, arr);
        
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        System.out.println(isSorted(arr.length, 0, arr));
        // int ans = fibonacciNum(11);
        // System.out.println(ans);
    }
}