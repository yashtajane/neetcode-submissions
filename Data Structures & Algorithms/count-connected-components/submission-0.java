class Solution {
    public int countComponents(int n, int[][] edges) {
        List<List<Integer>>adj = new ArrayList<>();
        boolean[] visit = new boolean[n];
        for(int i = 0 ; i<n ; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
        int res = 0 ;
        for(int component = 0 ; component < n ; component++){
            if(!visit[component]){
                dfs(adj,visit,component);
                res++;
            }
        }
        return res ;
    }
    public void dfs(List<List<Integer>>adj,boolean[] visit,int component){
        visit[component]=true;
        for(int nei : adj.get(component)){
            // if(nei==parent && visit[component]) continue ;
            if(!visit[nei]){
                dfs(adj,visit,nei);
            }
        }
    }
}
