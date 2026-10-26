class Solution {
    public Set<List<Integer>> res;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        res=new HashSet<>();
        Arrays.sort(candidates);
        List<Integer>cur = new ArrayList<>();
        backtrack(candidates,target,0,new ArrayList<>(), 0);
        return new ArrayList<>(res);
    }
    public void backtrack(int[] candidates,int target,int i, List<Integer> cur,int total){
        if(total == target){
            res.add(new ArrayList<>(cur)); return;
        }
        if(total>target || i>=candidates.length) return ;
        cur.add(candidates[i]);
        // total+candidates[i];
        backtrack(candidates,target,i+1,cur,total+candidates[i]);
        cur.remove(cur.size()-1);
        backtrack(candidates,target,i+1,cur,total);
    }
}
