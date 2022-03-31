public class Solution {
    public int solve(ArrayList<ArrayList<Integer>> A, int B) {
        int n=A.size();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n-B+1;i++){
            for(int j=0;j<n-B+1;j++){
                int sum=0;
                for(int k=i;k<i+B;k++){
                    for(int l=j;l<j+B;l++){
                        sum+=A.get(k).get(l);
                    }
                }
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}
