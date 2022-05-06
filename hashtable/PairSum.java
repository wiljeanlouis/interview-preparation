package hashtable;

import java.util.HashMap;
import java.util.Map;

public class PairSum {

    static int pairCounter(int[] arr, int k) {
        Map<Integer, Integer> intCount = new HashMap<>();
        int numberOfPairs = 0;

        for (int i = 0; i < arr.length; i++) {
          //  Integer v = intCount.get(arr[i]);
          //  intCount.put(arr[i], v == null ? 1 : v + 1);

            intCount.put(arr[i], intCount.getOrDefault(arr[i], 0) + 1);
        }

      //  System.out.println(intCount);

        for (int i = 0; i < arr.length; i++) {
            int compEl = k - arr[i];

           // intCount.keySet()

            if (intCount.containsKey(compEl)) {
                numberOfPairs += intCount.get(compEl);

                if(arr[i] == compEl) {
                    numberOfPairs --;
                }
            }
        }

        return numberOfPairs / 2;
    }

    public static void main(String[] args) {
        System.out.println(pairCounter(new int[]{1,2,3,4,3}, 6));
        System.out.println(pairCounter(new int[]{1,5,3,3,3}, 6));
        System.out.println(pairCounter(new int[]{3,3,3,3,1}, 6));
    }
}
