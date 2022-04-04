public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maximumGap(final List<Integer> A) {
        Collections.sort(A);
        int max=0;
        for(int i=0;i<A.size()-1;i++){
            max=Math.max(max,A.get(i+1)-A.get(i));
        }
        return max;
    }
}
