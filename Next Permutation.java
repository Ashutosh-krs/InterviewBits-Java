public class Solution {
    public ArrayList<Integer> nextPermutation(ArrayList<Integer> A) {
        int idx=-1;
        for(int i=0;i<A.size()-1;i++){
            if(A.get(i)<A.get(i+1))
                idx=i;
        }
        if(idx==-1){
            Collections.sort(A);
            return A;
        }
        int swap_idx=-1;
        for(int i=idx+1;i<A.size();i++){
            if(A.get(i)>A.get(idx))
                swap_idx=i;
        }
        int temp=A.get(idx);
        A.set(idx,A.get(swap_idx));
        A.set(swap_idx, temp);
        
        int lptr=A.size()-1;
        int sptr=idx+1;
        while(sptr<=lptr){
            temp=A.get(sptr);
            A.set(sptr, A.get(lptr));
            A.set(lptr, temp);
            sptr++;
            lptr--;
        }
        return A;
    }
}
