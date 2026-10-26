class Solution {
    public boolean carPooling(int[][] trips, int capacity) {
        Arrays.sort(trips,(a,b)->Integer.compare(a[1],b[1]));
        int n = trips.length;
        // int prev = trips[0][2];
        for(int i = 0 ; i<n ; i++){
            int temp = trips[i][0];
            for(int j = 0 ; j<i ; j++){
                if(trips[j][2]>trips[i][1]){
                    temp+=trips[j][0];
                }
            }
            if(temp>capacity) return false ;
        }
        return true ;
    }
}