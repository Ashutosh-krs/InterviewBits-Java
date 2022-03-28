public class Solution{
    public int solve(int B, ArrayList<Integer> A){
        int sum=0;
        for(int e:A){
            sum+=e;
        }
        if(sum%3!=0){
            return 0;
        }
        int u=sum/3;
        int v=(2*sum)/3;
        int aux[]=new int[B];
        sum=0;
        for(int i=0;i<B;i++){
            sum+=A.get(i);
            aux[i]=sum;
        }
        int count=0;
        int ans=0;
        for(int i=0;i<B-1;i++){
            
            if(aux[i]==v){
                ans=ans+count;
            }
            if(aux[i]==u){
                count++;
            }
            
        }
        return ans;
    }
}
