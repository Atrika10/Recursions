// Question => For a given array of size N. you have to find all the occurences(indices) of a given element(key) & print them. Use a recursive function to solve this problem.
public class keyMatch {

    public static void findKeyIndex(int arr[], int key, int idx){
        // base case
        if(idx == arr.length){
            return;
        }
        // work
        if(arr[idx] == key){
            System.out.print(idx + " ");
        }
        // next call
        findKeyIndex(arr, key, idx+1);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,5,6,7,2,8,2};
        int key = 12;
        findKeyIndex(arr, key, 0);
    }
}
