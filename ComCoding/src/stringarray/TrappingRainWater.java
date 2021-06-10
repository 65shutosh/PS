package stringarray;
//2
public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int[] arr2 = {2, 0, 2};
        int[] arr3 = {3, 0, 2, 0, 4};
        System.out.println(solution(arr));
        System.out.println(solution(arr2));
        System.out.println(solution(arr3));
    }

    public static int solution(int[] arr) {
        int l = 0;
        int r = arr.length - 1;
        int savedWater = 0;
        int currentMinHeight = Math.min(arr[l], arr[r]);
        while (r > l) {
            if (arr[l] <= arr[r]) {
                if (arr[l] < currentMinHeight)
                    savedWater += currentMinHeight - arr[l];
                else
                    currentMinHeight = Math.min(arr[l], arr[r]);
                l++;
            } else {
                if (arr[r] < currentMinHeight)
                    savedWater += currentMinHeight - arr[r];
                else
                    currentMinHeight = Math.min(arr[l], arr[r]);
                r--;
            }
        }

        return savedWater;
    }
}

