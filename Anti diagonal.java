public class Solution {
    public ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> A) {
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<2*A.size()-1;i++){
            res.add(new ArrayList<Integer>());
        }
        
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(0).size();j++){
                res.get(i+j).add(A.get(i).get(j));
            }
        }
        return res;
    }
}
