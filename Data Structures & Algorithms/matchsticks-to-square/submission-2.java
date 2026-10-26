class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum=0;
        for(int match : matchsticks){
            sum+=match;
        }
        if(sum%4!=0) return false ;
        int length = sum/4 ;
        Arrays.sort(matchsticks);
        reverse(matchsticks);
        int[] sides = new int[4];
        return bt(matchsticks,0,sides,length);
    }
    public void reverse(int[] matchsticks){
        for(int i = 0, j = matchsticks.length-1 ; i<j ; i++ ,j--){
            int temp = matchsticks[i];
            matchsticks[i]=matchsticks[j];
            matchsticks[j]=temp; 
        }
    }
    public boolean bt(int[] matchsticks,int index,int[] sides,int length){
        if(index==matchsticks.length) return true;
        for(int i = 0 ; i<4 ;i++){
            if(sides[i]+matchsticks[index]<=length){
               sides[i]+=matchsticks[index];
               if(bt(matchsticks,index+1,sides,length)) return true;
               sides[i]-=matchsticks[index];
            }
            if(sides[i]==0) break;
        }

        return false ;
    }
}