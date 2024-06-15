public class Power {

    // Time Complexity of this code is O(logn),As we divide our problem at each step; n = given power value
    // SComp. => O(1)
    public static double myPowHelpingFnx(double x, int n){
        // base case
        if(n==0){
           return 1;
        }

       // work
       double halfPow = myPowHelpingFnx(x, n/2);        // 2^5 => 2^2 * value of(2^2)
       double halfPowSq = halfPow *halfPow;             

       if (n %2 != 0) {    // odd fnx
           halfPowSq = x * halfPowSq;                  // if it is odd, then we have to add one more extra x
       }
       return halfPowSq;
   }

   public static double myPow(double x, int n) {
      int tempN = n;
      if (tempN < 0) {              // if n is negative, make n as positive & return final ans by dividing 1/ans
           tempN = -1 * n;
           return 1 / myPowHelpingFnx(x, tempN);
      }else{
       return myPowHelpingFnx(x, tempN);
      }

   }
    public static void main(String[] args) {
        double x = 2.0000; int n=-5;
        System.out.println(myPow(x, n));
    }
}
