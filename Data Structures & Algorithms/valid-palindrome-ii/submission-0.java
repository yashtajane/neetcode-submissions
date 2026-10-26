class Solution {
    public boolean validPalindrome(String s) {
        return mainPallindrome(s,0,s.length()-1);
    }
    boolean mainPallindrome(String s,int left,int right){
          while(left<right){
            if (s.charAt(left) != s.charAt(right)){
            return isPallindrome(s,left+1,right) || isPallindrome(s,left,right-1);
            }
            left++; right--;
          }

          return true ;
    }

    boolean isPallindrome(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)) return false ;
            left++;
            right--;
        }
      return true ;
    }

}