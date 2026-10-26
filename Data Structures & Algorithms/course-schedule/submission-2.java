class Solution {
    // HashMap preMap = new HashMap<>()
    public boolean canFinish(int numCourses, int[][] prerequisites) {
       List<List<Integer>> adj = new ArrayList<>();
       int [] indegree = new int [numCourses];

        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        
       for(int[] pre : prerequisites){
           indegree[pre[1]]++;
           adj.get(pre[0]).add(pre[1]);
       }

       Queue<Integer> q = new LinkedList<>();

       for(int i = 0 ; i<numCourses ; i++){
        if(indegree[i]==0){
            q.add(i);
        }
       }
          int f = 0 ;
       while(!q.isEmpty()){
         int node = q.poll();
         f++;
         for(int n : adj.get(node)){
            indegree[n]--;
            if(indegree[n]==0){
                q.add(n);
            }
         }
       }

       return f==numCourses;
    }
}
