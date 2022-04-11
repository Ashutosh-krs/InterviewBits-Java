public class Solution {
    public int titleToNumber(String A) {
        int val=0;
        for(int i=0;i<A.length();i++){
            val=val*26+(A.charAt(i)-'A'+1);
        }
        return val;
    }
}
