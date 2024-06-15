public class PowerOfThree {
    // Approch 1   (Brute force)
    public static boolean isPowerOfThreeHelpingFnx(int n, int i){
        // base case
        int ans = (int) Math.pow(3, i);
        if (ans > n || n == 0) {        // ans > n means, n lies in btw any 2 power of three
            return false;
        }

        // work
        if (ans == n) {
            return true;
        }

        // inner call
        return isPowerOfThreeHelpingFnx(n, i+1);
    }
    public static boolean isPowerOfThree(int n) {
        if (n < 0) {    
            n = -1*n;
        }
        return isPowerOfThreeHelpingFnx(n,0);
    }
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println(isPowerOfThree(n));
    }
}
