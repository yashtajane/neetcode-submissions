class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combine(int n, int k) {
        
        // List<List<Integer>> com = new ArrayList<>();
        bt(n,k,1,new ArrayList<Integer>());
        return res ; 
    }
    public void bt(int n , int k , int i , List<Integer>com){

         if (i > n) {
            if (com.size() == k) {
                res.add(new ArrayList<>(com));
            }
            return;
        }
        com.add(i);
        bt(n,k,i+1,com);
        com.remove(com.size()-1);
        bt(n,k,i+1,com);
    }
}