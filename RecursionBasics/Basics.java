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
    public static void main(String[] args) {

        int ans = fibonacciNum(11);
        System.out.println(ans);
    }
}