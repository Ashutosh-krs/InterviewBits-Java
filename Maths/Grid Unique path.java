public class Solution {
    public int uniquePaths(int A, int B) {
        if(A<=1 && B<=1) return 1;
        int grid[][]=new int[A][B];
        for(int i=0;i<A;i++){
            grid[i][B-1]=1;
        }
        for(int i=0;i<B;i++){
            grid[A-1][i]=1;
        }
        for(int i=A-2;i>=0;i--){
            for(int j=B-2;j>=0;j--){
                grid[i][j]=grid[i+1][j]+grid[i][j+1];
            }
        }
        return grid[0][0];
    }
}
