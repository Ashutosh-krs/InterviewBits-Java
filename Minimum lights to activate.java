public class Solution{
    public int solve(ArrayList<Integer> A, int B){
        int i=0;
        int count=0;
        int n=A.size();
        while(i<n){
            int cur=-1;
            int j=Math.max(0,i-B+1);
            int k=Math.min(n-1,i+B-1);
            for(int l=k;l>=j;l--){
                if(A.get(l)==1){
                    count++;
                    cur=1;
                    i=l+B;
                    break;
                }
            }
            if(cur==-1){
                return -1;
            }
        }
        return count;
    }
}
