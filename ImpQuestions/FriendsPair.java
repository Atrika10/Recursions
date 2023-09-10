// return total number of ways in friends can remain single or can be paired up
public class FriendsPair {

    public static int totalway(int n) {
        // base case
        if (n == 2 || n == 1) {
            return n;
        }
        // work
        // I've two choice => 1. friend can remain single
        int single = totalway(n - 1); // I've to analyse rest n-1
        // 2. friend can be paired up
        int pair = totalway(n - 2);
        /*
         * n-th person pairs up with any of the
         * remaining n - 1 persons. So apart from the 2 people forming a pair for
         * remaining n-2 persons; We get (n - 1) * f(n - 2) ways
         */
        int pairWays = (n - 1) * pair;
        int totalWays = single + pairWays; // this will give me my total number of ways
        return totalWays;
    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(totalway(3));
    }
}
