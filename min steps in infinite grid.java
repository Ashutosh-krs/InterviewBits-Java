public class Solution {
    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int x_prev=A.get(0);
        int y_prev=B.get(0);
        int min_steps=0;
        for(int i=1;i<A.size();i++){
            int x_curr=A.get(i);
            int y_curr=B.get(i);
            min_steps=Math.max(Math.abs(x_curr-x_prev), Math.abs(y_curr-y_prev));
            x_prev=x_curr;
            y_prev=y_curr;
        }
        return min_steps;
    }
}
