public class Solution {
    public int gcd(int A, int B) {
        if(A==0 && B!=0) return B;
        if(A!=0 && B==0) return A;
        int res=-1;
        for(int i=Math.min(A,B);i>0;i--){
            if(A%i==0 && B%i==0){
                res=i;
                break;
            }
        }
        return res;
    }
}
