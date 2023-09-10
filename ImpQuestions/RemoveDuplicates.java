// Remove duplicates from a String
public class RemoveDuplicates {

    // Time comp. => O(n) where n is the length of given string & Space Comp. => O(26) + O(n)=> O(n) where n is the length of sb
    public static String removeDup(String str, int arr[], int i, StringBuilder sb){
        // base case
        if (i == str.length()) {
            return sb.toString();
        }
        // work
        char ch = str.charAt(i);
        // is it exist 
        if (arr[ch - 'a']==0) { // first time it's coming
            sb.append(ch);
            arr[ch-'a']++;
        } 
        // when it's duplicate , call for next index
        removeDup(str, arr, i+1, sb);
        

        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "aappnnacollege";
        System.out.println(removeDup(str, new int[26], 0, new StringBuilder("")));
    }
}
