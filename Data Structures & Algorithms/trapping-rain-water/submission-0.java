class Solution {
    public int trap(int[] height) {
        int l=0,r=height.length-1;
        int lmax=height[l],rmax=height[r],wtt=0;

        if(height== null || height.length ==0) return 0;
        while(l<r){
            if(lmax<rmax){
                l++;
                lmax=Math.max(lmax,height[l]);
                wtt+=lmax-height[l];
            }
            else{
                r--;
                rmax=Math.max(rmax,height[r]);
                wtt+=rmax-height[r];
            }

        }
        return wtt;
    }
}
