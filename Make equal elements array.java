public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int trgt1=A.get(0);
        int trgt2=A.get(0)+B;
        int trgt3=A.get(0)-B;
        
        if(help(A,trgt1,B) || help(A,trgt2,B) || help(A,trgt3,B))
            return 1;
        return 0;
    }
    public boolean help(ArrayList<Integer> A, int trgt, int B){
        boolean isTrue=true;
        for(int i=0;i<A.size();i++){
            if(Math.abs(A.get(i)-trgt)==B||A.get(i)-trgt==0)
                continue;
            else
                isTrue=false;
                break;
        }
        return isTrue;
    }
}
