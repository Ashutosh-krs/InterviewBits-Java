public class Solution {
    public int solve(int A, int B, int C) {
        return (C+A-1)<=B?C+A-1:(C+A-1)%B;
    }
}
