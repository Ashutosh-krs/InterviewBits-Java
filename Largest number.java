import java.util.*;

public class Solution{
    public String largestNumber(final List<Integer> a){
        String arr[]=new String[a.size()];
        int i=0;
        for(int s:a){
            arr[i++]=String.valueOf(s);
        }
        Arrays.sort(arr, new Comparator<String>(){
            public int compare(String a, String b){
                return (b+a).compareTo(a+b);
            }
        });
        StringBuilder sb=new StringBuilder();
        for(String s:arr){
            sb.append(s);
        }
        if(sb.charAt(0)=='0'){
            return sb.toString();
        }
        return sb.toString();
    }
}
