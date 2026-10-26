class Solution {
    public int minCostConnectPoints(int[][] points) {
       PriorityQueue<int[]> minH = new PriorityQueue<>(Comparator.comparingInt(a -> a[0]));
        int cost = 0 ;
         Map<Integer, List<int[]>> adj = new HashMap<>();
        int n = points.length;
        for(int i=0;i<n;i++){
            int x1 = points[i][0];
            int y1 = points[i][1];
            for(int j = i+1 ; j<n ; j++){
                int x2 = points[j][0];
                int y2 = points[j][1];
                int dist = Math.abs(x1-x2)+Math.abs(y1-y2);
                adj.computeIfAbsent(i, k -> new ArrayList<>()).add(new int[]{dist, j});
                adj.computeIfAbsent(j, k -> new ArrayList<>()).add(new int[]{dist, i});
            }
        }
        Set<Integer> visit = new HashSet<>();
        minH.offer(new int[]{0,0});
        while(visit.size() < n){
             int curr[] = minH.poll();
             int distance = curr[0];
             int index = curr[1];
             if (visit.contains(index)) {
                continue;
            }
                 cost+= distance ;
                 visit.add(index);
                   for (int[] nei : adj.getOrDefault(index, Collections.emptyList())) {
                int neiCost = nei[0];
                int neiIndex = nei[1];
                if (!visit.contains(neiIndex)) {
                    minH.offer(new int[]{neiCost, neiIndex});
                }
            }
               
             }
             return cost;
        }
        
    }

