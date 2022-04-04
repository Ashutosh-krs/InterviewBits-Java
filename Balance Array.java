public class Solution {
    public int solve(ArrayList<Integer> A) {
        int evenSum=0;
        int oddSum=0;
        int cnt=0;
        for(int i=0;i<A.size();i++){
            if(i%2==0){
                evenSum+=A.get(i);
            }else{
                oddSum+=A.get(i);
            }
        }
        for(int i=0;i<A.size();i++){
            if(i%2==0){
                evenSum=evenSum-A.get(i);
                if(evenSum==oddSum)
                    cnt++;
                oddSum+=A.get(i);
            }else{
                oddSum=oddSum-A.get(i);
                if(evenSum==oddSum)
                    cnt++;
                evenSum+=A.get(i);
            }
        }
        return cnt;
    }
}
