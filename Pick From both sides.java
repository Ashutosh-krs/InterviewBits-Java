import java.util.*;
public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        Integer max=Integer.MIN_VALUE;
        
        
        int n=A.size();
        for(int i=0;i<=B;i++){
            int sum=0;
            for(int j=0;j<i;j++){
                sum+=A.get(j);
            }
            for(int k=0;k<B-i;k++){
                sum+=A.get(n-1-k);
            }
            max=Math.max(sum,max);
        }

        return max;
    }
}
