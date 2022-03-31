public class Solution {
    public ArrayList<Integer> subUnsort(ArrayList<Integer> A) {
        ArrayList<Integer> lst=new ArrayList<Integer>();
        for(int e:A){
            lst.add(e);
        }
        Collections.sort(lst);
        int start=-1, end=-1;
        for(int i=0;i<A.size();i++){
            if(A.get(i)!=lst.get(i) && start==-1){
                start=i;
            }
            if(A.get(i)!=lst.get(i))
                end=i;
        }
        if(start==-1&&end==-1){
            return new ArrayList<Integer>(Arrays.asList(-1));
        }
        return new ArrayList<Integer>(Arrays.asList(start,end));
    }
}
