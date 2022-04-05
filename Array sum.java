public class Solution {
    public ArrayList<Integer> addArrays(ArrayList<Integer> A, ArrayList<Integer> B) {
        Collections.reverse(A);
        Collections.reverse(B);
        int i=0,j=0;
        int carry=0;
        ArrayList<Integer> res=new ArrayList<Integer>();
        while(i<A.size() || j<B.size()){
            int x=A.size()>i?A.get(i):0;
            int y=B.size()>j?B.get(i):0;
            int temp=x+y+carry;
            carry=temp/10;
            res.add(temp%10);
            
            i++;
            j++;
        }
        if(carry>0)res.add(carry);
        Collections.reverse(res);
        return res;
    }
}
