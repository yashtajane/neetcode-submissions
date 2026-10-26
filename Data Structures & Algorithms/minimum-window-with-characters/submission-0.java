class Solution {
    public String minWindow(String s, String t) {

        if(s.length()<t.length() || t.length() == 0 ) return "";

        int [] res = {-1,-1};
        int l=0,have=0,need=0,resl=Integer.MAX_VALUE;

        Map<Character,Integer> window = new HashMap<>();
        Map<Character,Integer> tcount = new HashMap<>();

        for(int i = 0 ; i < t.length() ; i++){
            tcount.put(t.charAt(i),tcount.getOrDefault(t.charAt(i),0)+1);
        }

        need = tcount.size();

        for(int r = 0 ; r < s.length() ; r++){

            window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);

            if(tcount.containsKey(s.charAt(r)) && window.get(s.charAt(r)).equals(tcount.get(s.charAt(r))) ){
                have++;
            }

            while(have == need){
                if(r-l+1<resl){
                 resl=r-l+1;
                 res[0]=l;
                 res[1]=r;
                }
            

            char leftChar = s.charAt(l);
            window.put(leftChar, window.get(leftChar) - 1);

            if(tcount.containsKey(leftChar) && tcount.get(leftChar) > window.get(leftChar)){
                have--;
            }
                 l++;

        }
        }

     return resl==Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);   
        
    }
}
