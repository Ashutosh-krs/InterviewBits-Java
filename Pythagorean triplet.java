public class Solution {
    public int solve(int A) {
        int cnt=0;
        for(int i=1;i<=A;i++){
            for(int j=i+1;j<=A;j++){
                for(int k=j+1;k<=A;k++){
                    if(((i*i)+(j*j))==(k*k))
                        cnt++;
                }
            }
        }
        return cnt;
    }
}
