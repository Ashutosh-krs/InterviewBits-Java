public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int repeatedNumber(final List<Integer> A) {
        Collections.sort(A);
        HashMap mp=new HashMap<Integer, Integer>();
        for(int e:A){
            if (!mp.containsKey(e))
                mp.put(e,1);
            else
                return e;
        }
        return -1;
    }
}
