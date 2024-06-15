public class PowerOfThree {
    // Approch 2   (Optimize)
    public static boolean isPowerOfThree(int n) {
        if (n <= 0) {
            return false;
        }
        // if n is the power of 3 then below while loop run until n becomes 1
        // if n is not the power of 3 just only multiple or not multiple then n will not become 1
        while (n %3 == 0) {
            n /= 3;
        }
        // if n==1, means it's a power of 3
        return n==1;
    }
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println(isPowerOfThree(n));
    }
}
