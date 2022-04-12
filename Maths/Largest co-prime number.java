public class Solution {
    public int gcd(int a, int b){
        for(int i=Math.min(a,b);i>=1;i--){
            if(a%i==0 && b%i==0){
                return i;
            }
        }
        return 1;
    }
    public int cpFact(int A, int B) {
        int res=0;
        for(int i=A;i>=1;i--){
            if(A%i==0 && gcd(i,B)==1){
                return i;
            }
        }
        return res;
    }
}
