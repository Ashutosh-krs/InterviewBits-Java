public class Solution {
    public int solve(int[] A) {
        Arrays.sort(A);
        if(A[A.length-1]==0)
            return 1;
            
        for(int i=0;i<A.length-1;i++){
            if(A[i]==A[i+1])
                continue;
            else if(A[i]==(A.length-1-i) && A[i]!=A[i+1])
                return 1;
        }
        return -1;
    }
}
