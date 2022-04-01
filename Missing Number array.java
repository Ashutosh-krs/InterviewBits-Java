public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> repeatedNumber(final List<Integer> A) {
        int n=A.size();
        boolean[] check=new boolean[n+1];
        int n1=0,n2=0;
        for(int i=0;i<A.size();i++){
            int temp=A.get(i);
            if(check[temp]==true){
                n1=temp;
            }else{
                check[temp]=true;
            }
        }
        
        for(int i=1;i<check.length;i++){
            if(check[i]!=true)
                n2=i;
        }
        return new ArrayList<Integer>(Arrays.asList(n1,n2));
    }
}
