package sort;

public class QuickSort {

    static void sort(int[] items, int start, int end) {

        if (start < end) {
            int p = partition(items, start, end);

            sort(items, start, p - 1);
            sort(items, p + 1, end);
        }

    }

    static int partition(int[] items, int start, int end) {

        int pivot = items[end]; // we choose the last item as the pivot

        int j = start - 1;

        for(int i = start; i < end; i++) {
            if(items[i] <= pivot) {
                j++;
                int temp = items[i];
                items[i] = items[j];
                items[j] = temp;
            }
        }

        int temp = items[j + 1];
        items[j + 1] = pivot;
        items[end] = temp;

        return j+1;
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

/*
 * import java.util.*;
 * 
 * public class QuickSort {
 * static List<Integer> quickSort(List<Integer> items) {
 * if (items.size() <= 1) {
 * return items;
 * } else if (items.size() == 2) {
 * 
 * if (items.get(0) <= items.get(1)) {
 * return items;
 * } else {
 * List<Integer> a = new ArrayList<>();
 * a.add(items.get(1));
 * a.add(items.get(0));
 * return a;
 * }
 * } else {
 * int pivot = items.size() / 2;
 * List<Integer> left = new ArrayList<>();
 * List<Integer> right = new ArrayList<>();
 * 
 * for (int i = 0; i < items.size(); i++) {
 * if (i != pivot) {
 * Integer item = items.get(i);
 * if (item <= items.get(pivot)) {
 * left.add(item);
 * } else {
 * right.add(item);
 * }
 * }
 * }
 * List<Integer> result = quickSort(left);
 * result.add(items.get(pivot));
 * result.addAll(quickSort(right));
 * 
 * return result ;
 * }
 * }
 * 
 * // static int[] mergeIntArray(int[] a, int[] b) {
 * // int l = a.length + b.length;
 * // int[] result = new int[l];
 * // for (int i = 0; i < a.length; i++) {
 * // result[i] = a[i];
 * // }
 * // for (int i = l - 1; i < l; i++) {
 * // result[i] = b[i];
 * // }
 * // return result;
 * // }
 * 
 * public static void main(String[] args) {
 * 
 * //System.out.println(quickSort(Arrays.asList(2, 45, 5, 34, 101, -2, -100, 56,
 * 10, 5)));
 * System.out.println(quickSort(Arrays.asList(-5, 19, 3, 45, 67, 90, 4, 7,
 * -8)));
 * }
 * }
 */

// -10, -8, -6 5 7

// si a + b + c < 0
// qq soit x et y / x > b et y < c,
// a + x + y < 0

// -10 -8 + 4 = -14 < 0
// -10 -7 + 4 = -13 < 0
// -10 -5 + 4 = -11 < 0
// -10 -1 + 4 = -7 < 0
// -10 +2 + 4 = -4 < 0
// -10 +4 + 4 = -2 < 0
// -10 -8 + 3 = -15 < 0

// -10 -1 + 2 = -9 < 0

// si a + b + c < 0
// qq soit y / y < c,
// a + b + y < 0

// 5, 15 = 20
// 11, 12


