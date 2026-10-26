class Solution {
    public String minWindow(String s, String t) {

        if(t.isEmpty() || t.length() > s.length()) return "";

        int resl=Integer.MAX_VALUE,l=0,have=0,need=0;
        int [] res={-1,-1};

        Map<Character,Integer> tcount = new HashMap<>();
        Map<Character,Integer> window = new HashMap<>();

        for(int i=0 ; i<t.length() ; i++){
            tcount.put(t.charAt(i),tcount.getOrDefault(t.charAt(i),0)+1);
        }
          need = tcount.size();

        for(int r=0 ; r<s.length() ; r++){

            window.put(s.charAt(r),window.getOrDefault(s.charAt(r),0)+1);

            if(tcount.containsKey(s.charAt(r)) && 
            tcount.get(s.charAt(r)).equals(window.get(s.charAt(r)))){
                have++;
            }

            while(have==need){
                if(r-l+1 < resl){
                    resl = r-l+1;
                    res[0]=l;
                    res[1]=r;
                }
            
            

            char leftch = s.charAt(l);
            window.put(leftch,window.getOrDefault(leftch,0)-1);
            
            if(tcount.containsKey(leftch) && tcount.get(leftch)>window.get(leftch)){
                have--;
            }

            l++;
        }
        }

        return resl==Integer.MAX_VALUE ? "" : s.substring(res[0],res[1]+1);
        
    }
}
