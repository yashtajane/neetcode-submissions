class Solution {
    public boolean checkInclusion(String s1, String s2) {
           char[] s1a = s1.toCharArray();
           Arrays.sort(s1a);
           String s1ar = new String(s1a);

           for(int i = 0 ; i < s2.length() ; i++){
            for(int j = i ; j < s2.length() ; j++){
                char [] substr = s2.substring(i,j+1).toCharArray();
                Arrays.sort(substr);
                String s = new String(substr);
                if(s.equals(s1ar)) return true ;
            }
           }
         return false ;
    }
}
