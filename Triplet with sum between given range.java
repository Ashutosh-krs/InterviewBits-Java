public class Solution {
    public int solve(ArrayList<String> A) {
        ArrayList<Double> res=new ArrayList<Double>();
        for(String e:A){
            res.add(Double.valueOf(e));
        }
        Collections.sort(res);
        int i=0, j=res.size()-1;
        while(j-i>=2){
            if(res.get(i)+res.get(i+1)+res.get(j)>=1 && res.get(i)+res.get(i+1)+res.get(j)<=2){
                return 1;
            }else if(res.get(i)+res.get(i+1)+res.get(j)<1){
                i++;
            }else{
                j--;
            }
        }
        return 0;
    }
}
