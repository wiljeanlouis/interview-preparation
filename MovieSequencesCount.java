import java.util.Arrays;
import java.util.*;

public class MovieSequencesCount {

    static List<Integer> lengthEachScene(List<Character> inputList) {

        List<Integer> result = new ArrayList<>();
        int start = 0;

        while(start < inputList.size() - 1){
            int lastPosition = start;
            System.out.println(start);
            for(int i = start + 1; i < inputList.size(); i++) {
                if(inputList.get(i) == inputList.get(start)) {
                    lastPosition = i;
                }
            }
           // lastPosition ++;
            result.add(lastPosition + 1);
            start = lastPosition + 1;
           
        }

    


        return result;
    }


    /*

    start = 0 
    lastPosition = 24;

    1 ..... 24

    1) b == a 

    2) a == a
        lastPosition = 2

    3) b == a
    
    4) c == a
    
    5) b ==  a
    
    6) a == a
     lastPosition = 6 

    7) c == a 
    
    8) a == a
        lastPosition = 8

     lastPosition == 9   
    [9]
        -----

    start = 9
    lastPosition = 24

    10 ... 24

    10) e == d




    */

    public static void main(String[] args) {

        List<Character> shots0 = Arrays.asList('a', 'b', 'a', 'b', 'c', 'b', 'a', 'c', 'a', 'd', 'e', 'f', 'e', 'g', 'd', 'e', 'h', 'i', 'j', 'h', 'k', 'l', 'i', 'j');
        List<Character> shots1 = Arrays.asList('a', 'b', 'c');

        System.out.println(lengthEachScene(shots1)); //[9, 7, 8]

    }
}
