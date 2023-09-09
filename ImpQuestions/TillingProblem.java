/* you have a floor which is 2*n in size & tiles which is 2*1 in size, find maximum ways to place the tiles in
the given floor, you can place tiles in horizontally & vertically.
 */ 
public class TillingProblem {

    public static int countWays(int n){ // 2*n where n is the length of the given board
        // base case
        if (n ==0 || n== 1) {
            return 1;
        }
        //work
        // I've 2 choice, I can place the tiles in vertically or horizontally
        // vertical choice
        int fnm1 = countWays(n-1);  // I've already place 1 tiles vertically;now I've n-1 length left to place tiles, as the width of the tile is 1
        //horizontal choice
        int fnm2 = countWays(n-2); // I've already place 1 tiles horizontally, now I've n-2 length left to place tiles, as the height of the tile is 2
        int totalWays = fnm1+fnm2;  // in each level I will calculate totalway & will return this to the next level from which it has called
        return totalWays;
    }
    public static void main(String[] args) {
        System.out.println(countWays(5));
    }
    
}
