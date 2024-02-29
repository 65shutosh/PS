package java.sorting;

public class QuickSort {

    public static void main(String[] args) {
        QuickSort quickSort = new QuickSort();
        int[] arr = {10, 7, 8, 9, 1, 5};
        int n = arr.length;

        long startTime = System.currentTimeMillis();
        quickSort.sort(arr, 0, n - 1);
        long endTime = System.currentTimeMillis();
        System.out.println("Sorted array: ");
        for (int a : arr
        ) {
            System.out.print(a + " ");
        }
        System.out.println(startTime );
        System.out.println(endTime );
    }


    public void sort(int[] array, int start, int end) {
        if (start < end) {

            int pivotIndex = partition(array, start, end);

            sort(array, start, pivotIndex - 1);
            sort(array, pivotIndex + 1, end);

        }
    }

    private int partition(int[] array, int start, int end) {

        int pivot = array[end];
        int i = start - 1;
        for (int j = start; j < end; j++) {
            if (pivot > array[j]) {
                swap(array, ++i, j);
            }
        }
        swap(array, ++i, end);
        return i;
    }

    private void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

}
