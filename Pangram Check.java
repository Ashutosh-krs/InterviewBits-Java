public class Solution {
    public int solve(ArrayList<String> A) {
        int[] check=new int[26];
        for(String s:A){
            s=s.toLowerCase();
            for(int i=0;i<s.length();i++){
                check[s.charAt(i)-'a']=1;
            }
        }
        
        for(int i=0;i<26;i++){
            if(check[i]!=1){
                return 0;
            }
        }
        return 1;
    }
}
