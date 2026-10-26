class Solution {
    public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
                int [] price = new int[n];
                Arrays.fill(price,Integer.MAX_VALUE);
                price[src]=0;
                List<int[]>[] adj = new ArrayList[n];
                 for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
        }
                for(int[] flight : flights){
                    adj[flight[0]].add(new int[] { flight[1], flight[2] });
                }
                Queue<int[]> q = new LinkedList<>();
                q.offer(new int[]{0,src,0});
                while(!q.isEmpty()){
                    int [] cur = q.poll();
                    int currentcity = cur[1];
                    int cost = cur[0];
                    int stops=cur[2];
                    if(stops>k) continue ;
                    for(int [] neighbor : adj[currentcity]){
                        int nei = neighbor[0] ; int nxtc = neighbor[1]+cost;
                        if(price[nei]>nxtc){
                            price[nei]=nxtc;
                            q.offer(new int[]{nxtc,nei,stops+1});
                        }
                    }
                }
               return price[dst]==Integer.MAX_VALUE ? -1 : price[dst];
        }
}
