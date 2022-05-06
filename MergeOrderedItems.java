public class MergeOrderedItems {
    public static void main(String[] arg){

        String[] b = {"A", "Ba"};
        String[] a = {"Bo", "By", "Co"};

        String[] toPrint = order(a, b);

        for(int i = 0; i < toPrint.length; i++){
            System.out.println(toPrint[i]);
        }

    }

    private static String[] order(String[] a, String[] b){
        String[] result = new String[a.length + b.length];
        int ia = 0, ib = 0;

        for (int i = 0; i < result.length; i++){
            if(ia < a.length && ib < b.length ){
                if(a[ia].compareTo(b[ib]) <= 0){
                     result[i] = a[ia];
                    ia++;
                } else {
                    result[i] = b[ib];
                    ib++; 
                }
            } else if (ia < a.length ){
                result[i] = a[ia];
                ia++;
            } else if(ib < b.length){
                result[i] = b[ib];
                ib++;
            }
        }
        return result;
    }
}