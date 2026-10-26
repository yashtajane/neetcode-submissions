class Solution {
    public String longestCommonPrefix(String[] strs) {
        // String res = "";

        for(int i=0 ; i<strs[0].length() ; i++){
                // res+=strs[0][i];
            for(String s : strs){
                if(i==s.length() || s.charAt(i)!=strs[0].charAt(i)){
                    return s.substring(0,i);
                }
            }
        }
        return strs[0];
    }
}