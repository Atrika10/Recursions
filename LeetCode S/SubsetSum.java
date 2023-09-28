import java.util.*;
public class SubsetSum {

    public static void findSubsetSum(int idx, int sum, ArrayList<Integer> arr, int N, ArrayList<Integer> newAl){
        // base case
        if (idx == N) {
            // we traverse all the elements
            newAl.add(sum); // Now we're adding subset sum 
            return;
        }

        // work => I've 2 option either I can pick the element or I won't pick that element
        // picking element
        findSubsetSum(idx+1, sum +arr.get(idx), arr, N, newAl);

        // don't pick this element
        findSubsetSum(idx+1, sum, arr, N, newAl);
    }
    
    // time complexity => O(2^nlog(2^n)) => O(2^n)  as 2^n >> log(2^n)
    // space complexity => O(2^n)   where n is the length of the arraylist

    public static ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        ArrayList<Integer> newAl = new ArrayList<>();
        findSubsetSum(0, 0, arr, N, newAl); 
        Collections.sort(newAl);
        return newAl;
        
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(5);
        arr.add(2);
        arr.add(1);
        System.out.println(subsetSums(arr, arr.size()));
    }
}
