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
    public static void main(String[] args) {

        int ans = factorial(5);
        System.out.println(ans);
    }
}