/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
      int n = mountainArr.length() ;

      //Finding peak 
      int l = 1,r = n-2,peak=0 ;
      while(l<=r){
        int m = (l+r)/2 ;
        int left = mountainArr.get(m-1);
        int right =  mountainArr.get(m+1);
        int mid =  mountainArr.get(m);
        if(left<mid && mid<right){
          l=m+1;
        }
        else if(left>mid && mid>right){
           r=m-1;
        }
        else{
          peak=m;
          break;
        }
      }

      //Left portion
      l=0;r=peak-1;
      while(l<=r){
        int m = (l+r)/2;
        int val = mountainArr.get(m);
        if(val>target){
           r=m-1;
        }
        else if(val<target){
            l=m+1;
        }
        else{
            return m ;
        }
      }

    

    //right portion
      l=peak;r=n-1;
      while(l<=r){
        int m = (l+r)/2;
        int val = mountainArr.get(m);
        if(val<target){
           r=m-1;
        }
        else if(val>target){
            l=m+1;
        }
        else{
            return m ;
        }
      }
           return -1 ;

    }
}
