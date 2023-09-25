public class SearchInRotatedSortedArr {
    // Time complexity = > O(logn)

    public static int findTarget(int arr[], int si, int ei, int target) {
        // base case
        if (si > ei) {
            return -1;
        }
        // mid
        int mid = (si + ei) / 2;
        if (arr[mid] == target) {
            return mid; // return index of target element
        }
        // case 1 : mid on line 1
        if (arr[si] <= arr[mid]) {
            // case a : targeted element in left side of mid
            if (arr[si] <= target && target <= arr[mid]) {
                return findTarget(arr, si, mid - 1, target); // search on left
            }
            // case b : targeted element in right side of mid
            else {
                return findTarget(arr, mid + 1, ei, target);
            }
        }
        // case 2 : mid on line 2
        else {
            // case c: targeted element in right side of mid
            if (arr[mid] <= target && target <= arr[ei]) {
                return findTarget(arr, mid + 1, ei, target);
            }
            // case d : targeted element in left side of mid
            else {
                return findTarget(arr, si, mid - 1, target);
            }
        }
    }

    public static int search(int arr[], int tar, int si, int ei) {
        int i = 0;
        int idx = -1;
        while (i < arr.length) {
            if (si>ei) {
                return -1;
            }
            int mid = si + (ei - si) / 2;

            if (arr[mid] == tar) {
                idx = mid;
                break;
            } else {
                // case 1 : mid on line 1
                if (arr[si] <= arr[mid]) {
                    // case a : target element in left side
                    if (arr[si] <= tar && tar <= arr[mid]) {
                        ei = mid-1; // update ending index
                    }
                    else{
                        si = mid+1; // update starting index
                    }
                }
                // case 1 : mid on line 2
                else {
                    // case c: target element is in right side of mid
                    if (arr[mid] <= tar && tar <= arr[ei]) {
                        si = mid+1;
                    }else{
                        ei = mid-1;
                    }
                }
            }

        }
        return idx;
    }

    public static void main(String[] args) {
        int arr[] = { 4, 5, 6, 7, 0, 1, 2, 5 };
        int target = 10;
        // System.out.println(findTarget(arr, 0, arr.length - 1, target));
        System.out.println(search(arr, target, 0, arr.length-1));
    }
}
