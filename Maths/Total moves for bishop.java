public class Solution {
    public int solve(int A, int B) {
        int cnt=0;
        int tempX=A,tempY=B;
        while(tempX-1>0 && tempY-1>0){
            cnt++;
            tempX--;
            tempY--;
        }
        tempX=A;
        tempY=B;
        while(tempX+1<=8 && tempY+1<=8){
            cnt++;
            tempX++;
            tempY++;
        }
        tempX=A;
        tempY=B;
        while(tempX+1<=8 && tempY-1>0){
            cnt++;
            tempY--;
            tempX++;
        }
        tempX=A;
        tempY=B;
        while(tempX-1>0 && tempY+1<=8){
            cnt++;
            tempX--;
            tempY++;
        }
        return cnt;
    }
}
