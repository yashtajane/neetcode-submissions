class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int [] m = new int [l1+l2];
        System.arraycopy(nums1,0,m,0,l1);
        System.arraycopy(nums2,0,m,l1,l2);
        Arrays.sort(m);
        int L = m.length;

        if (L%2==0) return (m[L/2 - 1]+m[L/2])/2.0 ;
        else return m[L/2] ;
        
    }
}
