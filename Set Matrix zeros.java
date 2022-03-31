public class Solution {
	public void setZeroes(ArrayList<ArrayList<Integer>> a) {
	    ArrayList<Integer> lst1=new ArrayList<Integer>();
	    ArrayList<Integer> lst2=new ArrayList<Integer>();
	    
	    for(int i=0;i<a.size();i++){
	        for(int j=0;j<a.size();j++){
	            if(a.get(i).get(j)==0){
	                lst1.add(i);
	                lst2.add(j);
	            }
	        }
	    }
	    for(int i=0;i<lst1.size();i++){
	        for(int j=i;j<a.get(0).size();j++){
	            a.get(lst1.get(i)).set(j,0);
	        }
	    }
	    for(int i=0;i<lst2.size();i++){
	        for(int j=0;j<a.size();j++){
	            a.get(j).set(lst2.get(i),0);
	        }
	    }
	}
}
