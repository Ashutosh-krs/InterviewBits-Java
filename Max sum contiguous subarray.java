public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public int maxSubArray(final List<Integer> A) {
        int sum=0;
        int curr_sum=0;
        for(int i=0;i<A.size();i++){
            curr_sum=Math.max(A.get(i),curr_sum+A.get(i));
            sum=Math.max(curr_sum,sum);
        }
        return sum;
    }
}
