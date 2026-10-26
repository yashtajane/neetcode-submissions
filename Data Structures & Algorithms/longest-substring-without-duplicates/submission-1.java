class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set <Character> h = new HashSet<>();
        int cl=0,maxl=0;;

        for(int i=0;i<s.length();i++){
           while(h.contains(s.charAt(i))){
                 h.remove(s.charAt(cl));
                 cl++;
           }
            
                h.add(s.charAt(i));
                maxl=Math.max(maxl,i-cl+1);
            }
            return maxl;
            
        }

        

        
    }

