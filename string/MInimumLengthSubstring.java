package string;
import java.util.*;

public class MInimumLengthSubstring {

    static int minLengthSubstring(String s, String t) {
        // Write your code here
        int minLength = Integer.MAX_VALUE;
        Map<Character, Integer> window = new HashMap<>();
        Map<Character, Integer> countT = new HashMap<>();
        

        for(int i = 0; i < t.length(); i++){
            countT.put(t.charAt(i), countT.getOrDefault(t.charAt(i), 0) + 1);
        }

        int have = 0, need = countT.size(), l = 0;

        for(int r = 0; r < s.length(); r++){
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);


            if(countT.containsKey(c) && window.get(c) == countT.get(c)) {
                have++;

                while(have == need) {
                    if(r - l + 1 < minLength) {
                        minLength = r - l + 1;
                    }

                    char leftChar = s.charAt(l);

                    window.put(leftChar, window.get(leftChar) - 1);

                    if(countT.containsKey(leftChar) && window.get(leftChar) < countT.get(leftChar)){
                        have--;
                    }

                    l++;
                }
            }
        }


        
        
        
        return minLength;
    }

    public static void main(String[] args) {
        System.out.println(minLengthSubstring("dcbefebce", "fd"));
        System.out.println(minLengthSubstring("aa", "aa"));
      //  System.out.println();
      //  System.out.println();
    }
    
}
