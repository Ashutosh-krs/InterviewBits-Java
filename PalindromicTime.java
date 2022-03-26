public class Solution {
    public int solve(String A) {
        int h=(A.charAt(0)-'0')*10+(A.charAt(1)-'0');
        int m=(A.charAt(3)-'0')*10+(A.charAt(4)-'0');
        int count=0;
        while(h/10!=m%10 || h%10!=m/10){
            count++;
            m++;
            if(m==60){
                m=0;
                h++;
            }
            if(h==24){
                h=0;
            }
        }
        return count;
    }
}
