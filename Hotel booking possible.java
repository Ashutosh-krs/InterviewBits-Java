public class Solution {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        Collections.sort(arrive);
        Collections.sort(depart);
        int n=arrive.size();
        int i=0,j=0,reqd=0;
        while(i<n && j<n && reqd<=K){
            if(arrive.get(i)<depart.get(j)){
                i++;
                reqd++;
            }else{
                reqd--;
                j++;
            }
        }
        if(reqd<=K){
            return true;
        }
        return false;
    }
}
