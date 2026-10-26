class Solution {
    List<String>res;
    Set<String>ws;
    public List<String> wordBreak(String s, List<String> wordDict) {
        res=new ArrayList<>();
        ws = new HashSet<>(wordDict);
        List<String>cur = new ArrayList<>();
        bt(s,res,0,cur);
        return res;
    }
    public void bt(String s,List<String>res,int i,List<String>cur){
        if(i==s.length()) res.add(String.join(" ", cur));
        for(int j=i ; j<s.length() ; j++){
            String w = s.substring(i,j+1);
            if(ws.contains(w)){
                cur.add(w);
                bt(s,res,j+1,cur);
                cur.remove(cur.size()-1);
            }
        }
    }
}