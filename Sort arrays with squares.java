import java.util.*;
public class Solution {
    public ArrayList<Integer> solve(ArrayList<Integer> A) {
        for(int i=0;i<A.size();i++){
            A.set(i, A.get(i)*A.get(i));
        }
        Collections.sort(A);
        return A;
    }
}
