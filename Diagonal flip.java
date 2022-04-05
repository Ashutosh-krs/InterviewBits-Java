public class Solution {
    public ArrayList<ArrayList<Integer>> solve(ArrayList<ArrayList<Integer>> A) {
        int temp=0;
        for(int i=0;i<A.size();i++){
            for(int j=i;j<A.get(0).size();j++){
                temp = A.get(i).get(j);
                A.get(i).set(j,A.get(j).get(i));
                A.get(j).set(i,temp);
            }
        }
        return A;
    }
}
