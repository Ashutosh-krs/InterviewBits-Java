public class Solution {
    // DO NOT MODIFY THE LIST
    public int repeatedNumber(final List<Integer> A) {
        if(A.size()==1)
            return A.get(0);
        Collections.sort(A);
        int prev=-1,curr=-1,thres=A.size()/3;
        int cnt=0;
        int res=-1;
        for(int i=0;i<A.size();i++){
            
            prev=curr;
            curr=A.get(i);
            if(prev==curr){
                cnt++;
            }else if(prev!=curr){
                cnt=1;
            }
            if(cnt>thres){
                return curr;
            }
            //System.out.println(curr);
        }
        return -1;
    }
}
