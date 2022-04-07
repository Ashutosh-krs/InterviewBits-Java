public class Solution {
    public int solve(int A) {
        A=Math.abs(A);
        int step=0;
        int sum=0;
        while(sum<A){
            step++;
            sum+=step;
        }
        while((sum-A)%2!=0){
            step++;
            sum+=step;
        }
        return step;
    }
}
