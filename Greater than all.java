public class Solution {
    public int solve(ArrayList<Integer> A) {
        int cnt=0;
        int max=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)>max)
                cnt++;
                max=Math.max(A.get(i),max);
        }
        return max;
    }
}
