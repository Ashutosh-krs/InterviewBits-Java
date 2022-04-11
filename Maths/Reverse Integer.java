public class Solution {
    public int reverse(int A) {
        int isNumPos=A>0?1:0;
        A=Math.abs(A);
        long ans=0;
        while(A!=0){
            ans=ans*10+A%10;
            A=A/10;
        }
        if(ans>Integer.MAX_VALUE) return 0;
        if(isNumPos==1) return (int)ans;
        return -1*(int)ans;
    }
}
