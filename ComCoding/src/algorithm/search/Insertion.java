package algorithm.search;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        Insertion insertion = new Insertion();
        System.out.println(Arrays.toString(insertion.insertionSort(new int[]{0,6, 1, 2, 3,53,4,3,0,1,43,4,2,23,2,343,43,5,45,342,4,32,323,23})));

    }


    public int[] insertionSort(int[] arr) {
        if (arr.length == 0 || arr.length == 1)
            return arr;

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j >= 1; j--) {
                if (arr[j - 1] > arr[j]) {
                    arr[j - 1] = arr[j - 1] + arr[j];
                    arr[j] = arr[j - 1] - arr[j];
                    arr[j - 1] = arr[j - 1] - arr[j];
                }else break;
            }
        }
        return arr;
    }


    void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
