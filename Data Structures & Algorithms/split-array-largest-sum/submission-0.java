class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0,r=0;
        for(int num : nums){
          l=Math.max(l,num);
          r+=num;
        }
        int res = r;
        while(l<=r){
            int mid = (l+r)/2 ;
            if(cs(nums,mid,k)){
               res = mid ;
               r = mid - 1 ;
            }
            else{
                l = mid + 1 ;
            }
        }
        return res ;
    }
    public boolean cs(int[]nums , int large , int k){
        int curS = 0 , subA = 1 ;
        for(int num : nums){
            curS+=num;
            if(curS > large){
                subA++;
                if(subA>k) return false ;
                curS = num ;
            }
        }
        return true ; 
    }
}