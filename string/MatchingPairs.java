package string;

public class MatchingPairs {
    static  int matchingPairs(String s, String t) {
        // Write your code here
        int maxGlobal = Integer.MIN_VALUE;
        
        for(int i = 0; i < s.length(); i++) {
          int maxLocal = 0;
          for(int j = i+1; j < s.length(); j++) {
            
            StringBuilder sPartial = new StringBuilder(s);
            sPartial.setCharAt(i, s.charAt(j));
            sPartial.setCharAt(j, s.charAt(i));
            
            String newS = sPartial.toString();
            int count = 0;
                    
            for(int k = 0; k < s.length(); k++) {
              if(newS.charAt(k) == t.charAt(k)) {
                count++;
                if(count > maxLocal) {
                  maxLocal = count;
                }
              } 
             }
          }
          if(maxLocal > maxGlobal) {
            maxGlobal = maxLocal;
          }
        }
        return maxGlobal;
      }


      public static void main(String[] args) {

      //  String s = "abxcc", t = "abcdx";
        String s = "abxce", t = "abcdx";

        System.out.println(matchingPairs(s, t));
    }
}
