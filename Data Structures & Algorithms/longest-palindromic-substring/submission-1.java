class Solution {
    public String longestPalindrome(String s) {
        int resl=0,resindx=0;
        for(int i = 0 ; i < s.length() ; i++){
            
            //Even length 
            int l=i,r=i+1;
            while(l>=0 && r<s.length()  && s.charAt(l)==s.charAt(r)){
                if( resl<r-l+1){
                       resindx=l;
                       resl = r-l+1;
                      
                }
                       l--;
                       r++;
            }

            //odd length 
             l=i;r=i;
            while(l>=0 && r<s.length()  && s.charAt(l)==s.charAt(r)){
                if(resl<r-l+1){
                       resindx=l;
                       resl = r-l+1;
                }
                l--;
                       r++;
            }
        }

        return s.substring(resindx,resindx+resl);
    }
}
