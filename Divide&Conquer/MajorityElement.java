/*
 * Given an array nums of size n, returnthe majority element. (MEDIUM)The majority element is the element that appears more than ⌊n/2⌋ times.You mayassume that the majority element always exists in the array
 */

import java.util.*;
public class MajorityElement {

    // Time & space complexity of this code is => O(n) where n is the length of the given array
    public static int findMajorityElement(int[] nums){
        // step -1 
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        // step -2 : Iteration on hashmap
        int maxValue = Integer.MIN_VALUE;
        int majorElem = -1;

        Set<Integer> keys = hm.keySet();
        for (Integer k : keys) {    // k=3
            if (hm.get(k) > maxValue) {
                maxValue = hm.get(k);   // update maxValue & majorELement
                majorElem = k;
            }
        }
        // step -3 
        if (maxValue > nums.length/2) {
            return majorElem;
        }else{
            return -1;      // Majority element doesn't exist
        }
    }
    public static void main(String[] args) {
        int nums[] = {6, 1, 15, 19, 9, 13, 12, 6, 7, 2, 10, 4, 1, 14 ,11, 14, 14, 13};
        System.out.println(findMajorityElement(nums));
    }
}
