package stringarray;

import static java.util.Arrays.binarySearch;
//3
// Problem -https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class SearchInSortedRotatedArray {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 9, 0, 1, 2, 3, 4};
        solution(arr, 0);
        int[] arr2 = {4, 5, 6, 7, 0, 1, 2};
        solution(arr2, 0);
        int[] arr3 = {4, 5, 6, 7, 0, 1, 2};
        solution(arr3, 3);
        int[] arr4 = {1};
        solution(arr4, 0);
    }

    public static void solution(int[] arr, int target) {
        System.out.println(recursiveSolution(arr, 0, arr.length - 1, target));
    }

    private static int recursiveSolution(int[] arr, int l, int r, int target) {
        while (r >= l) {
            int mid = l + ((r - l) / 2);
            if (arr[mid] == target) return mid;
            if (arr[mid] > arr[r]) {
                // when left half is sorted
                //if target in first sorted half
                if (target >= arr[l] && target < arr[mid])
                    return binarySearch(arr, l, mid - 1, target);
                //if target in second half
                l = mid + 1;
            } else {
                // when right half is sorted
                // when target is in second sorted half
                if (target > arr[mid] && target <= arr[r])
                    return binarySearch(arr, mid + 1, r, target);
                //if target in first half
                r = mid - 1;
            }
        }
        return -1;
    }
}
