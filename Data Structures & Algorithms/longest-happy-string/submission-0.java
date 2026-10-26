class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int rep = -1 ;
        StringBuilder res = new StringBuilder();
        int [] count = {a , b , c};
        while(true){
            int mc = getMax(count,rep);
            if(mc==-1) break;
            res.append((char)(mc+'a'));
            count[mc]--;
            if(res.length()>1 && res.charAt(res.length()-1)==
            res.charAt(res.length()-2)){
                rep=mc;
            }
            else{
                rep=-1;
            }

        }
        return res.toString();
    }
    public int getMax(int[] count,int rep){
        int index = -1,mc=0;
        for(int i = 0 ; i < 3 ; i++){
            if(i==rep || count[i]==0){
                continue;
            }
            if(count[i]>mc){
                mc=count[i];
                index=i;
            }
        }

        return index;
    }
}