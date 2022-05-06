package sort;

public class InsertionSort {

    static void sort(int[] items) {

        for (int i = 1; i < items.length; i++) {
            int j = i;
            while (j > 0 && items[j] < items[j - 1]) {
                int temp = items[j];
                items[j] = items[j - 1];
                items[j - 1] = temp;
                j--;
            }
        }

        

    }

    /*
     * 
     * i = 1
     * j = 1 ->
     * 19 < -5 non,
     * [-5, 19, 3, 45, 67, 90, 4, 7, -8 ]
     * ****
     * i = 2
     * j = 2 -> 
     * 3 < 19 oui,
     * [-5, 3, 19, 45, 67, 90, 4, 7, -8 ]
     * j = 1 ->
     * 3 < -5, non
     * ***
     * i = 3
     * j = 3 -> 
     * 45 < 19, non
     * ***
     * i = 4
     * j = 4 ->
     * 67 < 45, non
     * ***
     * i = 5
     * j = 5 ->
     * 90 < 67, non
     * ***
     * i = 6
     * j = 6 ->
     * 4 < 90, oui
     * [-5, 3, 19, 45, 67, 4, 90, 7, -8 ]
     * j = 5 ->
     * 4 < 67, oui
     * [-5, 3, 19, 45, 4, 67, 90, 7, -8 ]
     * 
     */

     static void printArray(int[] toPrint) {
        for (int i = 0; i < toPrint.length; i++) {
            System.out.print(toPrint[i]);
            System.out.print(", ");

        }
     }

    public static void main(String[] args) {

       // int[] items = new int[] { -5, 19, 3, 45, 67, 90, 4, 7, -8 };
         int[] items = new int[] { 1, 2, 3};

        sort(items);
        printArray(items);  
    

    }
}


