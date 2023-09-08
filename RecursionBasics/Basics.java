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
    public static void main(String[] args) {

        int ans = sumOfNaturalNum(10);
        System.out.println(ans);
    }
}