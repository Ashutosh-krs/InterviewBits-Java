public class Solution {
    public int maxArr(ArrayList<Integer> A) {
        int maxSum=A.get(0);
        int minSum=A.get(0);
        
        for(int i=0;i<A.size();i++){
            maxSum=Math.max(A.get(i)+i,maxSum);
            minSum=Math.min(A.get(i)+i,minSum);
        }
        int resSum=maxSum-minSum;
        
        int maxDiff=A.get(0);
        int minDiff=A.get(0);
        for(int i=0;i<A.size();i++){
            maxDiff=Math.max(A.get(i)-i,maxDiff);
            minDiff=Math.min(A.get(i)-i,minDiff);
        }
        int resDiff=maxDiff-minDiff;
        
        return Math.max(resDiff, resSum);
    }
}
