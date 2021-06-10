package sorting;

public class MergeSort {

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = {10, 7, 8, 9, 1, 5};
        ms.mergeSort(arr, 0, arr.length - 1);
        System.out.println("Sorted array: ");
        for (int a : arr
        ) {
            System.out.print(a + " ");
        }
    }

    public void mergeSort(int[] array, int start, int end) {
        if (start < end) {
            int partition = (start + end-1) / 2;

            mergeSort(array, start, partition);
            mergeSort(array, partition + 1, end);

            merge(array, start, partition, end);
        }

    }

    public void merge(int[] array, int start, int partition, int end) {
        int[] temp = new int[end - start + 1];
        int k = 0;
        for (int i = start, j = partition + 1; i <= partition || j <= end; ) {
            if (i > partition) {
                temp[k++] = array[j++];
            } else if (j > end) {
                temp[k++] = array[i++];
            } else if (array[i] <= array[j]) {
                temp[k++] = array[i++];
            } else {
                temp[k++] = array[j++];
            }
        }
        System.out.println("for " + start + " " + partition + " " + end + "");
        for (int x : temp
        ) {
            System.out.println(x + " ");
        }
        System.out.println("");
        if (temp.length > 0) System.arraycopy(temp, 0, array, start, temp.length);
    }


}
