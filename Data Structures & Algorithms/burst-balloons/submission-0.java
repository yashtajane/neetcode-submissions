class Solution {
    public int maxCoins(int[] nums) {
        int[]newNum = new int[nums.length+2];
        newNum[0]=newNum[nums.length+1]=1;
        for(int i=1 ;  i<newNum.length-1 ; i++){
            newNum[i]=nums[i-1];
        }
        return dfs(newNum);
    }

    public int dfs(int[] nums){
        if(nums.length == 2) return 0 ;
        int max=0;
        for(int i = 1 ; i<nums.length-1 ; i++){
            int coins = nums[i-1]*nums[i]*nums[i+1];
            int[] newNum = new int[nums.length-1];
            for(int j=0,k=0 ; j<nums.length ; j++){
                if(j!=i){
                    newNum[k++]=nums[j];
                }
            }
            coins+=dfs(newNum);
            max=Math.max(max,coins);
        }
        return max ; 
    }

    
}
