class Solution {
    int i = 0 ;
    public String decodeString(String s) {
        return helper(s);
    }
    public String helper(String s){
        int k = 0 ;
        StringBuilder res = new StringBuilder();
     
        while(i<s.length()){
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                k=k*10+(c-'0');
            }
            else if(c=='['){
               i++;
               String subres = helper(s);
               while(k-- > 0) res.append(subres);
               k=0;
            }
            else if(c==']'){
                return res.toString();
            }
            else{
                res.append(c);
            }
            i++;
        }
        return res.toString();
    }


}