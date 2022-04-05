public class Solution {
    public ArrayList<Integer> findOccurences(ArrayList<Integer> A) {
        Collections.sort(A);
        Map<Integer,Integer> mp=new HashMap<Integer,Integer>();
        for(int i=0;i<A.size();i++){
            if(!mp.containsKey(A.get(i)))
                mp.put(A.get(i),1);
            else
                mp.replace(A.get(i),mp.get(A.get(i))+1);
        }
        ArrayList<Integer> res=new ArrayList<Integer>(mp.keySet());
        Collections.sort(res);
        for(int i=0;i<res.size();i++)
            res.set(i,mp.get(res.get(i)));
        return res;
    }
}
