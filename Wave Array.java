public class Solution {
    public ArrayList<Integer> wave(ArrayList<Integer> A) {
        Collections.sort(A);
        ArrayList<Integer> res=new ArrayList<Integer>();
        
        for(int i=0;i<A.size();i+=2){
            int j=i+1;
            if(j<A.size()){
                res.add(A.get(j));
                res.add(A.get(i));
            }else{
                res.add(A.get(i));
            }
        }
        return res;
    }
}
