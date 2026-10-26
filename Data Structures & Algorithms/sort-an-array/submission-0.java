class Solution {
    public int[] sortArray(int[] nums) {
         ms(nums,0,nums.length-1);
         return nums;
     }
     void ms(int[]nums,int l,int r){
        if(l>=r) return ;
        int m =(l+r)/2;
        ms(nums,l,m);
        ms(nums,m+1,r);
        fm(nums,l,r,m);

        // return nums;
    }
    void fm(int[] nums,int l,int r,int m){
        int i=l;
        int j=m+1;
        List<Integer> temp = new ArrayList<>();
        while(i<=m && j<=r){
          if(nums[i]<=nums[j]){
            temp.add(nums[i]);
            i++;
          }
          else{
            temp.add(nums[j]);
            j++;
          }
        }
        while(i<=m){
           temp.add(nums[i]);
            i++;
        }
        while(j<=r){
            temp.add(nums[j]);
            j++;
        }
        for(i=l ; i<=r ; i++){
            nums[i]=temp.get(i-l);
        }
    }
}