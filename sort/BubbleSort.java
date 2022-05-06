package sort;

public class BubbleSort {

    static void sort(int[] items) {

        for(int i = 0; i < items.length; i++) {
            boolean swapped = false;

            for (int j = 0; j < items.length - i - 1; j++) {
                if(items[j] > items[j+1]) {
                    int temp = items[j];
                    items[j] = items[j+1];
                    items[j+1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) {
                break;
            }
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
        // int[] items = new int[] { 1, 2, 3};

        sort(items);
        printArray(items);  
    

    }
}
