/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {
        if(intervals==null) return null;
        
        ArrayList<Interval> merged=new ArrayList<Interval>();
        
        Collections.sort(intervals, (a,b)->Integer.compare(a.start,b.start));
        
        for(Interval crnt: intervals){
            if(merged.size()==0 || merged.get(merged.size()-1).end<crnt.start){
                //System.out.println(crnt);
                merged.add(crnt);
            }else{
                merged.get(merged.size()-1).end=Math.max(merged.get(merged.size()-1).end,crnt.end);
            }
        }
        return merged;
    }
}
