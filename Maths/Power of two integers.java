public class Solution {
    public int isPower(int A) {
        if(A==1)
            return 1;
        for(int i=2;i<A;i++){
            int temp=A;
            while(temp%i==0){
                temp/=i;
            }
            if(temp==1)
                return 1;
        }
        return 0;
    }
}
