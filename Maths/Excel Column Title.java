public class Solution {
    public String convertToTitle(int A) {
        StringBuilder str=new StringBuilder("");
        while(A!=0){
            if(A%26==0){
                str.append("Z");
                A=A/26-1;
            }else{
                str.append((char)(65+A%26-1));
                A=A/26;
            }
        }
        return str.reverse().toString();
    }
}
