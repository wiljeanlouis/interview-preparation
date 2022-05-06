package sort;

public class MergeSort {

    static void sort(int[] items, int start, int end) {

        if (start < end) {
            int mid = (end + start) / 2;

            sort(items, start, mid);
            sort(items, mid + 1, end);
            merge(items, start, mid, end);
        }

    }

    static void merge(int[] items, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start, j = mid + 1, k = 0;

        while (i <= mid && j <= end) {
            if (items[i] < items[j]) {
                temp[k] = items[i];
                i++;
                k++;
            } else {
                temp[k] = items[j];
                j++;
                k++;
            }
        }

        while (i <= mid) {
            temp[k] = items[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = items[j];
            j++;
            k++;
        }

        for(i = start; i <= end; i++) {
            items[i] = temp[i - start];
        }
    }

    static void printArray(int[] toPrint) {
        for (int i = 0; i < toPrint.length; i++) {
            System.out.print(toPrint[i]);
            System.out.print(", ");
        }
    }

    public static void main(String[] args) {
        int[] items = new int[] { -5, 19, 3, 45, 67, 90, 4, 7, -8 };

        sort(items, 0, items.length - 1);
        printArray(items);
    }
}
