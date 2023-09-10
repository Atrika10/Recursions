// print Binary String of size N without Consequtive 1s
public class PrintBinaryString {

    public static void printBinStr(int n, int lastPlace, String s){
        // base case
        if (n==0) {     // means I don't have any place left with me
            System.out.println(s);
            return;
        }
        // kaam
        // I've 2 choice in each step, I can place 0 or 1 in current position if my lastplace is 0
        printBinStr(n-1, 0, s+"0"); // place 0 in string & passing 0 as my last position for the next call

        // I can place 1 only if I've 0 as my lastPlace (As the rule of consequtive ones)
        if (lastPlace == 0){
            printBinStr(n-1, 1, s+"1");
        }
    }
    public static void main(String[] args) {
        int n = 3;
        printBinStr(n, 0, "");
    }
}
