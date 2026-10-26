class Solution {
    public int maxArea(int[] heights) {
       int l=0,r=heights.length-1; int Max=0;
       while(l<r){
        Max=Math.max(Math.min(heights[l],heights[r])*(r-l),Max);
        if(heights[l]>heights[r]){
            r--;
        }
        else{
           l++; 
        }

       }
        
        return Max;
    }
}
