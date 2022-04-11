public class Solution {
    public int isPalindrome(int A) {
        String str=String.valueOf(A);
        char[] ch=str.toCharArray();
        int i=0;
        int j=ch.length-1;
        while(i<=j){
            if(ch[i]==ch[j]){
                i++;
                j--;
                continue;
            }else{
                return 0;
            }
        }
        return 1;
    }
}
