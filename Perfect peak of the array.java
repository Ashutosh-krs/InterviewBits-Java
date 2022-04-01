public class Solution {
    public int perfectPeak(ArrayList<Integer> A) {
        int n=A.size();
        int lft[]=new int[n];
        int rght[]=new int[n];
        lft[0]=A.get(0);
        rght[n-1]=A.get(n-1);
        
        for(int i=1;i<n;i++)
        lft[i]=Math.max(lft[i-1],A.get(i));
        
        for(int i=n-2;i>=0;i--)
        rght[i]=Math.min(rght[i+1],A.get(i));
        
        for(int i=1;i<n-1;i++)
        {
            if(A.get(i)>lft[i-1]&&A.get(i)<rght[i+1])
            return 1;
        }
        
        return 0;
    }
}
