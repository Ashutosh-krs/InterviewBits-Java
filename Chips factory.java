public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        int idx=0,cnt=0;
        for(int i=0;i<A.size();i++){
            if(A.get(i)==0)
                cnt++;
            else
                A.set(idx++,A.get(i));
        }
        for(int i=0;i<cnt;i++)
            A.set(idx++,0);
        return A;
    }
}
