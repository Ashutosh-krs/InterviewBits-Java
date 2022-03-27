public class Solution {
    public ArrayList<Integer> plusOne(ArrayList<Integer> A) {
        int carry=1;
        while(A.get(0)==0 && A.size()>1){
            A.remove(0);
        }
        for(int i=A.size()-1;i>=0;i--){
            if(carry!=0 && A.get(i)<9){
                A.set(i,A.get(i)+1);
                carry=0;
                break;
            }else if(A.get(i)==9 &&carry!=0){
                A.set(i, 0);
                carry=1;
            }
        }
        if(carry==1){
            A.add(0,1);
        }
        return A;
    }
}
