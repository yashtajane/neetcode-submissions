class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> s = new ArrayList<>();
        for(int stone : stones){
            s.add(stone);
        }
        while(s.size()>1){
            Collections.sort(s);
            int curr = s.remove(s.size()-1)-s.remove(s.size()-1);
            if(curr!=0) s.add(curr);
        }
        return (s.isEmpty()) ? 0 : s.get(0) ;
    }
}
