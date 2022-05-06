package sort;

public class SelectionSort {

    static void sort(int[] items) {

        for(int i = 0; i < items.length - 1; i++) {

            int indexMin = i;
            for(int j = i+1; j < items.length; j++) {
                if(items[j] < items[indexMin]){
                    indexMin = j;
                }
            }

            if(indexMin != i) {
                int temp = items[i];
                items[i] = items[indexMin];
                items[indexMin] = temp;
            }

            printArray(items); 
        }
    }

    /*

        i = 0  (0, 1, ... , 7)
            j = 1  (1, 2, ... , 8)
            -5 < 19

            j = 2 
            -5 < 3

            j = 2 
            -5 < 45

            j = 8
            -5 < -8
            indexMin = 8

            [-8, 19, 3, 45, 67, 90, 4, 7, -5]

        i = 1 
            [-8, -5, 3, 45, 67, 90, 4, 7, 19]

        i = 2
            [-8, -5, 3, 45, 67, 90, 4, 7, 19]

        i = 3
             [-8, -5, 3, 4, 67, 90, 45, 7, 19]


    */

    static void printArray(int[] toPrint) {
        for (int i = 0; i < toPrint.length; i++) {
            System.out.print(toPrint[i]);
            System.out.print(", ");
           
        }
        System.out.println("");
     }

    public static void main(String[] args) {

        int[] items = new int[] { -5, 19, 3, 45, 67, 90, 4, 7, -8 };
        // int[] items = new int[] { 2, 1, 0};

        sort(items);
        printArray(items);  
    

    }
    
}
