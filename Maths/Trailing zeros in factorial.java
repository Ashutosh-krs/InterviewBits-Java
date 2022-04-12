public class Solution {
    public int trailingZeroes(int A) {
        int cnt=0;
        int n=5;
        while(A/n>=1){
            int temp=A/n;
            cnt+=temp;
            n=n*5;
        }
        return cnt;
    }
}
