public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int cnt=0,idx=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)!=0)
                A.set(idx++, A.get(i));
            else
                cnt++;
        }
        for(int i=0;i<cnt;i++){
            A.set(idx++,0);
        }
        return A;
    }
}
