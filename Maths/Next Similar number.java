public class Solution {
    public String solve(String A) {
        char[] ch=A.toCharArray();
        int idx=-1;
        for(int i=0;i<ch.length-1;i++){
            if(ch[i]<ch[i+1])
                idx=i;
        }
        if(idx==-1){
            return "-1";
        }
        int swap_idx=-1;
        for(int i=idx+1;i<ch.length;i++){
            if(ch[i]>ch[idx])
                swap_idx=i;
        }
        char temp=ch[idx];
        ch[idx]=ch[swap_idx];
        ch[swap_idx]=temp;
        
        int lptr=idx+1;
        int rptr=ch.length-1;
        while(lptr<=rptr){
            temp=ch[lptr];
            ch[lptr]=ch[rptr];
            ch[rptr]=temp;
            lptr++;
            rptr--;
        }
        String res="";
        for(char c:ch){
            res+=c;
        }
        return res;
    }
}
