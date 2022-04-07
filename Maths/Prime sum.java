public class Solution {
    public boolean isPrime(int A){
        for(int i=2;i<A;i++){
            if(A%i==0)
                return false;
        }
        return true;
    }
    public ArrayList<Integer> primesum(int A) {
        ArrayList<Integer> res=new ArrayList<Integer>();
        for(int i=2;i<A;i++){
            if(isPrime(i) && isPrime(A-i)){
                res.add(i);
                res.add(A-i);
                break;
            }
        }
        return res;
    }
}
