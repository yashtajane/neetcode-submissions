class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int c=0;
        Arrays.sort(people);
        int n = people.length;
        int left = 0 ;
        int right = people.length-1;
        while(left<=right){
            if(people[left]+people[right]<=limit){
                left++;
            }
            right--; c++;
        }
     

        return c ;
    }
}