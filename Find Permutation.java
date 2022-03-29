public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> findPerm(final String A, int B) {
        ArrayList<Integer> helper=new ArrayList<Integer>();
        ArrayList<Integer> result=new ArrayList<Integer>();
        
        for(int i=1;i<=B;i++){
            helper.add(i);
        }
        
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)=='I')
                result.add(helper.remove(0));
            if(A.charAt(i)=='D')
                result.add(helper.remove(helper.size()-1));
        }
        result.add(helper.remove(0));
        return result;
    }
}
