public class Solution {
    public int firstMissingPositive(ArrayList<Integer> A) {
        Collections.sort(A);
        int n=A.size();
        int res=1;
        for(int i=0;i<n;i++){
            if(A.get(i)==0 || A.get(i)==1){
                res=A.get(i)+1;
            }else if(A.get(i)<0){
                continue;
            }else if(A.get(i)==res && A.get(i)>0){
                res++;
            }else if(A.get(i)!=res&&A.get(i)>0){
                return res;
            }
        }
        return res;
    }
}
