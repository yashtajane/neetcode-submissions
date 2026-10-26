class Solution {
    public String reorganizeString(String s) {
        int [] freq = new int[26];
        for(char c : s.toCharArray()){
            freq[c-'a']++;
        }
         int mf = Arrays.stream(freq).max().getAsInt();
         if (mf > (s.length() + 1) / 2) {
            return "";
        }
      
        StringBuilder res = new StringBuilder();
        while(res.length()<s.length()){
              int mfi = fmi(freq);
              char mfc = (char)(mfi + 'a');
              res.append(mfc);
              freq[mfi]--;
              if(freq[mfi]==0) continue;
              int tmp = freq[mfi];
              freq[mfi] = Integer.MIN_VALUE;
              int nmi = fmi(freq);
              char nmfc = (char)(nmi +'a');
              res.append(nmfc);
              freq[mfi] = tmp;
              freq[nmi]--;
        }
        return res.toString();
    }
    public int fmi(int[] freq){
        int mi = 0;
        for(int i = 0 ; i < freq.length ; i++){
            if(freq[i]>freq[mi]){
              mi=i;
            }
        }
        return mi;
    }
}